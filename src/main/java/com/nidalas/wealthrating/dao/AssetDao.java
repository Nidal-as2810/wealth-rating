package com.nidalas.wealthrating.dao;

import com.nidalas.wealthrating.entity.AssetEntity;
import com.nidalas.wealthrating.repository.AssetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class AssetDao {
    @Autowired
    private AssetRepo assetRepo;

    public AssetEntity save(AssetEntity asset){

        asset.setCity(asset.getCity().toLowerCase());
        return  this.assetRepo.save(asset);
    }

    public float getByCity(String city){
        AssetEntity asset=this.assetRepo.getByCity(city.toLowerCase());
        if (asset==null){
            return 0;
        }
        return asset.getAssetValue();
    }
}
