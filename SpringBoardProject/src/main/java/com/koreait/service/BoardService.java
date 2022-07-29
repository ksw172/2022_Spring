package com.koreait.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.koreait.dto.BoardDTO;
import com.koreait.mapper.BoardMapper;

@Service
public class BoardService {
	private BoardMapper mapper;

	public BoardService(BoardMapper mapper) {
		this.mapper = mapper;
	}

	public List<BoardDTO> selectBoardList(int pageNo) {
		return mapper.selectBoardList(pageNo);
	}

	public int selectBoardCount() {
		return mapper.selectBoardCount();
	}
	
	
}




