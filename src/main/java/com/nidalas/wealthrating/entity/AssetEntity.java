package com.nidalas.wealthrating.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "city_assets")
public class AssetEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    private Integer id;

    @Column(name = "city_name")
    private String city;

    @Column(name = "asset_value")
    private  float assetValue;
}
