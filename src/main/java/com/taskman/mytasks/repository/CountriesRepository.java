package com.taskman.mytasks.repository;

import com.taskman.mytasks.entity.Countries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountriesRepository extends JpaRepository <Countries, Integer> {
}
