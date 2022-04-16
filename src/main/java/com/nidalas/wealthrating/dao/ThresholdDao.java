package com.nidalas.wealthrating.dao;

import com.nidalas.wealthrating.entity.WealthThresholdEntity;
import com.nidalas.wealthrating.repository.ThresholdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThresholdDao {
    @Autowired
    private ThresholdRepo thresholdRepo;

    public float getThreshold(){
        int id=1;
        WealthThresholdEntity threshold=this.thresholdRepo.getById(id);
        return threshold.getThreshold();
    }

    public WealthThresholdEntity add(WealthThresholdEntity threshold){
        if(threshold.getId()!=1){
            threshold.setId(1);
        }
        return this.thresholdRepo.save(threshold);
    }
}
