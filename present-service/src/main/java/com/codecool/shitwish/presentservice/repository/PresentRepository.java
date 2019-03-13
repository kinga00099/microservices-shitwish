package com.codecool.shitwish.presentservice.repository;

import com.codecool.shitwish.presentservice.model.Present;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PresentRepository extends JpaRepository<Present, Integer> {
}
