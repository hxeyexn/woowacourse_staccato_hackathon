package com.staccato.visit.dto;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.staccato.visit.domain.Comment;
import com.staccato.visit.domain.Visit;

public record VisitDetailResponse(
        Long visitId,
        String placeName,
        String visitImage,
        String address,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
        LocalDate visitedAt,
        List<CommentResponse> comments
) {
    public VisitDetailResponse(Visit visit, List<Comment> comments) {
        this(
                visit.getId(),
                visit.getPlaceName(),
                visit.getImage(),
                visit.getAddress(),
                visit.getVisitedAt(),
                convertToCommentResponse(comments));
    }

    private static List<CommentResponse> convertToCommentResponse(List<Comment> comments) {
        return comments.stream()
                .map(CommentResponse::new)
                .toList();
    }
}
