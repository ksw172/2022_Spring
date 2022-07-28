package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.dto.MemberDTO;
import com.example.mapper.MemberMapper;

@Service
public class MemberService {
	private MemberMapper mapper;

	public MemberService(MemberMapper mapper) {
		super();
		this.mapper = mapper;
	}

	public List<MemberDTO> selectAllMember() {
		return mapper.selectAllMember();
	}

	public int insertMember(MemberDTO dto) {
		return mapper.insertMember(dto);
	}

	public int delete(String id) {
		return mapper.deleteMember(id);
	}

	public MemberDTO selectMember(String id) {
		return mapper.selectMember(id);
	}
	
	
}





