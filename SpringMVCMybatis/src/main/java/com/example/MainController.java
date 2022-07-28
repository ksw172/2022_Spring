package com.example;

import java.util.List;

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
}









