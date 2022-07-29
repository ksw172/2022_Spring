package com.koreait.service;

import org.springframework.stereotype.Service;

import com.koreait.mapper.MemberMapper;

@Service
public class MemberService {
	private MemberMapper mapper;

	public MemberService(MemberMapper mapper) {
		this.mapper = mapper;
	}
	
	
}
