package com.staccato.travel.dto;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.staccato.member.domain.Member;
import com.staccato.travel.domain.Travel;
import com.staccato.visit.domain.Visit;

public record TravelDetailResponse(
        Long travelId,
        String travelTitle,
        String travelThumbnail,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
        LocalDate startAt,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
        LocalDate endAt,
        String description,
        List<MateResponse> mates,
        List<VisitResponse> visits
) {
    public TravelDetailResponse(Travel travel, List<Visit> visits) {
        this(
                travel.getId(),
                travel.getTitle(),
                travel.getThumbnail(),
                travel.getStartAt(),
                travel.getEndAt(),
                travel.getDescription(),
                convertToMateResponses(travel.getMembers()),
                convertToVisitResponses(visits)
        );
    }

    private static List<MateResponse> convertToMateResponses(List<Member> members) {
        return members.stream()
                .map(MateResponse::new)
                .toList();
    }

    private static List<VisitResponse> convertToVisitResponses(List<Visit> visits) {
        return visits.stream()
                .map(VisitResponse::new)
                .toList();
    }
}
