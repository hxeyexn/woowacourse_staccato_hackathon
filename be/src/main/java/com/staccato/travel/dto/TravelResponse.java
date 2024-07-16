package com.staccato.travel.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.staccato.travel.domain.Travel;
import java.time.LocalDate;

public record TravelResponse(
        Long travelId,
        String travelTitle,
        String travelThumbnail,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
        LocalDate startAt,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
        LocalDate endAt
) {
    public TravelResponse(Travel travel) {
        this(
                travel.getId(),
                travel.getTitle(),
                travel.getThumbnail(),
                travel.getStartAt(),
                travel.getEndAt()
        );
    }
}
