package com.example;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dto.MemberDTO;
import com.example.service.MemberService;

@Controller
public class MainController {
	private MemberService service;

	public MainController(MemberService service) {
		this.service = service;
	}
	
	@RequestMapping("/")
	public String main(Model model) {
		//전체 회원정보를 읽어와서 출력
		List<MemberDTO> list = service.selectAllMember();
		model.addAttribute("list", list);
		return "main";
	}
	
	@RequestMapping("/register.do")
	public String register(MemberDTO dto) {
		System.out.println(dto);
		service.insertMember(dto);
		return "redirect:/";
	}
	
	@RequestMapping("/delete.do")
	public String delete(String id) {
		System.out.println(id);
		service.delete(id);
		return "redirect:/";
	}
	
	@RequestMapping("/updateView.do")
	public String updateView(String id, Model model) {
		MemberDTO dto = service.selectMember(id);
		model.addAttribute("dto", dto);
		return "update_view";
	}
	@RequestMapping("/update.do")
	public String update(MemberDTO dto) {
		System.out.println(dto);
		service.updateMember(dto);
		return "redirect:/";
	}
	
	@RequestMapping("/search.do")
	public void	search(String kind, String search, HttpServletResponse response) throws IOException {
		System.out.println(kind + " " + search);
		//검색을 수행
		List<MemberDTO> list = service.searchMember(kind,search);
		System.out.println(list.size());
		//검색 결과를 받아서 JSON으로 변환한뒤에 클라이언트에 전송
		JSONArray json = new JSONArray(list);
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().write(json.toString());
	}
}









