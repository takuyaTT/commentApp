package com.example.demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.demo.model.*;
import com.example.demo.repository.*;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Component
public class DataLoader implements CommandLineRunner {
	private final CommentRepository repository;
	
	public DataLoader(CommentRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public void run(String...args)throws Exception{
		Comment comment = new Comment();
		comment.setContent("こんにちは");
		repository.save(comment);
		
		comment = new Comment();
		comment.setContent("山田");
		repository.save(comment);
	}
}
