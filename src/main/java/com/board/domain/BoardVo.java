package com.board.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class BoardVo {
	private  int      bno;
	private  String   menu_id;
	private  String   title;
	private  String   content;
	private  String   writer;
	private  String   regdate;
	private  int      hit;
	


	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}


	public String getContent() {
		return null;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public void setContent(String content) {
		
	}

	public String getMenu_id() {
		return null;
	}
	
	
}




