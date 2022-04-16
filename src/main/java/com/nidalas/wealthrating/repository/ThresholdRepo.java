package com.nidalas.wealthrating.repository;

import com.nidalas.wealthrating.entity.WealthThresholdEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThresholdRepo extends JpaRepository<WealthThresholdEntity,Integer> {
}
