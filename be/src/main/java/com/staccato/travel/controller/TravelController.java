package com.staccato.travel.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.staccato.travel.dto.TravelResponse;
import com.staccato.travel.service.TravelService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/travels")
public class TravelController {
    private final TravelService travelService;

    @GetMapping("/{travelId}")
    public ResponseEntity<TravelResponse> findTravelById(@PathVariable Long travelId) {
        return ResponseEntity.ok(travelService.findById(travelId));
    }
}
