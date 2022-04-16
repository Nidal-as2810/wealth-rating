package com.nidalas.wealthrating.controller;

import com.nidalas.wealthrating.dao.AssetDao;
import com.nidalas.wealthrating.entity.AssetEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/central-bank/regional-info")
@CrossOrigin
public class AssetController {
    @Autowired
    private AssetDao assetDao;

    @PostMapping(path = "/save")
    public AssetEntity save(@RequestBody AssetEntity asset){
        return this.assetDao.save(asset);
    }

    @GetMapping(path = "/evaluate")
    public float getByCity(@RequestParam String city){
        return this.assetDao.getByCity(city);
    }
}
