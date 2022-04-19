package com.nidalas.wealthrating.controller;

import com.nidalas.wealthrating.dao.WealthDao;
import com.nidalas.wealthrating.entity.Person;
import com.nidalas.wealthrating.entity.WealthEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/central-bank/wealthy")
@CrossOrigin
public class WealthController {
    @Autowired
    private WealthDao wealthDao;
    @Autowired
    private ThresholdController thresholdController;
    @Autowired
    private AssetController assetController;

    @GetMapping(path = "/get-all")
    public List<WealthEntity> getAll(){
        return this.wealthDao.getAll();
    }

    @GetMapping(path = "/get-by-id")
    public WealthEntity getById(@RequestParam Long id){
        return this.wealthDao.getById(id);
    }

    @PostMapping(path = "/wealth-rating")
    public String wealthRating(@RequestBody Person person){
        double threshold=this.thresholdController.getThreshold();
        float assetValue=this.assetController.getByCity(person.getPersonalInfo().getCity());

        return this.wealthDao.wealthRate(person, assetValue, threshold);

    }
}
