package com.example.demo.model;

import javax.persistence.*;
import javax.validation.constraints.*;

import lombok.Getter;
import lombok.Setter;

/*
@Getter
@Setter
*/
@Entity
public class Comment {
	@Id
	@GeneratedValue
	private Long id;
	
	@NotBlank
	@Size(max = 40)
	private String content;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}