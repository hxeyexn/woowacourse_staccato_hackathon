package com.staccato.visit.dto;

import com.staccato.visit.domain.Comment;

public record CommentResponse(
        Long commentId,
        Long memberId,
        String nickName,
        String memberImage,
        String content
) {
    public CommentResponse(Comment comment) {
        this(
                comment.getId(),
                comment.getMember().getId(),
                comment.getMember().getNickname(),
                comment.getMember().getImage(),
                comment.getContent());
    }
}
