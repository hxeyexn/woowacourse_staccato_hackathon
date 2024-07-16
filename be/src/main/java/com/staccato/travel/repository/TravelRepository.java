package com.staccato.travel.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.staccato.travel.domain.Travel;

public interface TravelRepository extends JpaRepository<Travel, Long> {
    List<Travel> findByMembersId(Long memberId);
}
