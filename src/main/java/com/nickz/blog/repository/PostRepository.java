package com.nickz.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nickz.blog.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}
