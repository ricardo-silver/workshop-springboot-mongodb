package com.silversolutIons.workshopmongo.domain;

import java.io.Serializable;
import java.util.Date;

import com.silversolutIons.workshopmongo.dto.AuthorDTO;

public class CommentDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String test;
	private Date date;
	private AuthorDTO author;
	
	public CommentDTO() {
		
	}

	public CommentDTO(String test, Date date, AuthorDTO author) {
		super();
		this.test = test;
		this.date = date;
		this.author = author;
	}
	

}
