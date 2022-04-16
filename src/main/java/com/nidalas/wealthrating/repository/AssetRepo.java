package com.nidalas.wealthrating.repository;

import com.nidalas.wealthrating.entity.AssetEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetRepo extends JpaRepository<AssetEntity,Integer> {
    AssetEntity getByCity(String city);
}
