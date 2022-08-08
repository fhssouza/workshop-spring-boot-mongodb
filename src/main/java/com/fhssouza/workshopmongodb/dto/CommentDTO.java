package com.fhssouza.workshopmongodb.dto;

import java.io.Serializable;
import java.util.Date;

public class CommentDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String text;
	private Date date;
	private AuthorDTO autDto;
	
	public CommentDTO() {
	}

	public CommentDTO(String text, Date date, AuthorDTO autDto) {
		super();
		this.text = text;
		this.date = date;
		this.autDto = autDto;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public AuthorDTO getAutDto() {
		return autDto;
	}

	public void setAutDto(AuthorDTO autDto) {
		this.autDto = autDto;
	}
	
	
}
