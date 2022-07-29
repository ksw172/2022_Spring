package com.koreait;

import org.springframework.stereotype.Controller;

import com.koreait.service.BoardService;
import com.koreait.service.MemberService;

@Controller
public class MainController {
	private BoardService boardService;
	private MemberService memberService;

	public MainController(BoardService boardService, MemberService memberService) {
		this.boardService = boardService;
		this.memberService = memberService;
	}
	
	
}
