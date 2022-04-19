package com.nidalas.wealthrating.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "wealthy")
public class WealthEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "id_number")
    private Long idNumber;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "fortune")
    private double fortune;
}
