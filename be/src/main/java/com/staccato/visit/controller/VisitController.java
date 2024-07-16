package com.staccato.visit.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.staccato.visit.dto.VisitDetailResponse;
import com.staccato.visit.service.VisitService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/visits")
public class VisitController {
    private final VisitService visitService;

    @GetMapping("/{visitId}")
    public ResponseEntity<VisitDetailResponse> findVisitByVisitId(@PathVariable Long visitId) {
        return ResponseEntity.ok(visitService.findVisitById(visitId));
    }
}
