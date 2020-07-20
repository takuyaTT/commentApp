package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.*;

public interface CommentRepository extends JpaRepository<Comment, Long> {
	//JpaRepositoryを継承するだけでDBの取得や保存等の処理ができる
}
