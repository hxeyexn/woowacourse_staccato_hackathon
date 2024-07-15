package com.staccato.travel.service;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.staccato.travel.domain.Travel;
import com.staccato.travel.dto.TravelResponse;
import com.staccato.travel.repository.TravelRepository;
import com.staccato.visit.repository.VisitRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TravelService {
    private final TravelRepository travelRepository;
    private final VisitRepository visitRepository;

    public TravelResponse findById(Long id) {
        return new TravelResponse(getById(id), visitRepository.findAllByTravelId(id));
    }

    private Travel getById(Long id) {
        return travelRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("에궁 ㅠㅠ 요청하신 여행이 없어요 >3<"));
    }

}
