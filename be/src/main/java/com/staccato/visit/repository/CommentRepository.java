package com.staccato.visit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.staccato.visit.domain.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findAllByVisitId(Long id);
}
