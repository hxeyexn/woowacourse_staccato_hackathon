package com.staccato.visit.domain;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import com.staccato.travel.domain.Travel;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Visit {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @Column
    private String placeName;
    @Column
    private String image;
    @Column
    private String address;
    @Column
    private LocalDate visitedAt;
    @ManyToOne
    private Travel travel;

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Visit visit = (Visit) o;
        return Objects.equals(id, visit.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
