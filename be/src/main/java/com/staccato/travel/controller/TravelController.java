package com.staccato.travel.controller;

import com.staccato.travel.dto.TravelDetailResponse;
import com.staccato.travel.dto.TravelResponses;
import com.staccato.travel.service.TravelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/travels")
public class TravelController {
    private final TravelService travelService;

    // 나중에 쿠키로 유저정보 주면, 유저 id에 맞는 여행들만 가져오도록 변경
    @GetMapping
    public ResponseEntity<TravelResponses> findTravels() {
        return ResponseEntity.ok(travelService.findAll());
    }

    @GetMapping("/{travelId}")
    public ResponseEntity<TravelDetailResponse> findTravelById(@PathVariable Long travelId) {
        return ResponseEntity.ok(travelService.findById(travelId));
    }
}
