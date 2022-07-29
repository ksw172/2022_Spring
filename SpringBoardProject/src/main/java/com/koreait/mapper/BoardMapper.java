package com.koreait.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.koreait.dto.BoardDTO;

@Mapper
public interface BoardMapper {

	List<BoardDTO> selectBoardList(int pageNo);
	int selectBoardCount();
	BoardDTO selectBoardDTO(int bno);

}
