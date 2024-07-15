package com.staccato.travel.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.staccato.visit.domain.Visit;

public record VisitResponse(
        Long visitId,
        String placeName,
        String visitImage,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
        LocalDate visitedAt
) {
    public VisitResponse(Visit visit) {
        this(visit.getId(), visit.getPlaceName(), visit.getImage(), visit.getVisitedAt());
    }
}
