package com.nidalas.wealthrating.dao;

import com.nidalas.wealthrating.entity.AssetEntity;
import com.nidalas.wealthrating.repository.AssetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssetDao {
    @Autowired
    private AssetRepo assetRepo;

    public AssetEntity save(AssetEntity asset){
        return  this.assetRepo.save(asset);
    }

    public float getByCity(String city){
        AssetEntity asset=this.assetRepo.getByCity(city);

        return asset.getAssetValue();
    }
}
