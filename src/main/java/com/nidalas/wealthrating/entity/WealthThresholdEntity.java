package com.nidalas.wealthrating.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "wealth_threshold")
public class WealthThresholdEntity {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "threshold")
    private float 	threshold;
}
