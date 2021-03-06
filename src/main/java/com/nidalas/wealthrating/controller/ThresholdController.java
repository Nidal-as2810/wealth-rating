package com.nidalas.wealthrating.controller;

import com.nidalas.wealthrating.dao.ThresholdDao;
import com.nidalas.wealthrating.entity.WealthThresholdEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/central-bank")
@CrossOrigin
public class ThresholdController {
    @Autowired
    private ThresholdDao thresholdDao;

    @GetMapping(path = "/wealth-threshold")
    public double getThreshold(){
        return this.thresholdDao.getThreshold();
    }

}
