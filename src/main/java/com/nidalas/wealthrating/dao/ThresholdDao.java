package com.nidalas.wealthrating.dao;

import com.nidalas.wealthrating.entity.WealthThresholdEntity;
import com.nidalas.wealthrating.repository.ThresholdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThresholdDao {
    @Autowired
    private ThresholdRepo thresholdRepo;

    public double getThreshold(){
           return 2586667816.0;
    }

}
