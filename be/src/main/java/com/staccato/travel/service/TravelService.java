package com.staccato.travel.service;

import com.staccato.travel.domain.Travel;
import com.staccato.travel.dto.TravelDetailResponse;
import com.staccato.travel.dto.TravelResponses;
import com.staccato.travel.repository.TravelRepository;
import com.staccato.visit.repository.VisitRepository;
import java.util.List;
import java.util.NoSuchElementException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TravelService {
    private final TravelRepository travelRepository;
    private final VisitRepository visitRepository;

    public TravelResponses findByMemberId(Long memberId) {
        List<Travel> travels = travelRepository.findByMembersId(memberId);
        return TravelResponses.from(travels);
    }

    public TravelDetailResponse findById(Long id) {
        return new TravelDetailResponse(getById(id), visitRepository.findAllByTravelId(id));
    }

    private Travel getById(Long id) {
        return travelRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("에궁 ㅠㅠ 요청하신 여행이 없어요 >3<"));
    }
}
