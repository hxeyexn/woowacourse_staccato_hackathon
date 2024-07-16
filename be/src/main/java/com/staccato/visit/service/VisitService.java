package com.staccato.visit.service;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.staccato.visit.domain.Visit;
import com.staccato.visit.dto.VisitDetailResponse;
import com.staccato.visit.repository.CommentRepository;
import com.staccato.visit.repository.VisitRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VisitService {
    private final VisitRepository visitRepository;
    private final CommentRepository commentRepository;

    public VisitDetailResponse findVisitById(Long id) {
        return new VisitDetailResponse(getById(id), commentRepository.findAllByVisitId(id));
    }

    private Visit getById(Long id) {
        return visitRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("에궁 ㅠㅠ 요청하신 방문 기록이 없어요 >3<"));
    }
}
