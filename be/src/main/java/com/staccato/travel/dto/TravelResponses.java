package com.staccato.travel.dto;

import com.staccato.travel.domain.Travel;
import java.util.List;

public record TravelResponses(List<TravelResponse> travels) {

    // 여기서 정적팩토리메서드로 Travel -> TravelResponse를 변환하는 과정을 거칠지, Service에서 할지 고민
    public static TravelResponses from(List<Travel> travels) {
        return new TravelResponses(
                travels.stream()
                        .map(TravelResponse::new)
                        .toList()
        );
    }
}
