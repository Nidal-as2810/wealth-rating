package com.nidalas.wealthrating.repository;

import com.nidalas.wealthrating.entity.WealthEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WealthyRepo extends JpaRepository<WealthEntity,Integer> {
    WealthEntity getByIdNumber(Long id);
}
