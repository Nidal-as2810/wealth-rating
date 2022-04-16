package com.nidalas.wealthrating.entity;

import lombok.Data;

@Data
public class Person {
    private String id;
    private PersonalInfo personalInfo;
    private FinancialInfo financialInfo;
}
