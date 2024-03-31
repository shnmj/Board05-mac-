package com.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.board.domain.BoardVo;
import com.board.menus.domain.MenuVo;

@Mapper
public interface BoardMapper {

	void insertBoard(BoardVo boardVo);

	List<BoardVo> getBoard(MenuVo menuVo);

	void incHit(BoardVo boardVo);

	void deleteBoard(BoardVo boardVo);

	void updateBoard(BoardVo boardVo);

	BoardVo getBoardList(BoardVo boardVo);

}






