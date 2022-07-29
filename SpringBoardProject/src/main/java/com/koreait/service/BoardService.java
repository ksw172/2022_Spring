package com.koreait.service;

import org.springframework.stereotype.Service;

import com.koreait.mapper.BoardMapper;

@Service
public class BoardService {
	private BoardMapper mapper;

	public BoardService(BoardMapper mapper) {
		this.mapper = mapper;
	}
	
	
}
