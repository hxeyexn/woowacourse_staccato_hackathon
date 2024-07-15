package com.staccato.travel.dto;

import com.staccato.member.domain.Member;

public record MateResponse(
        Long memberId,
        String nickName,
        String memberImage
) {
    public MateResponse(Member member) {
        this(member.getId(), member.getNickname(), member.getImage());
    }
}
