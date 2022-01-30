package com.app.employeeapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity @Data
@NoArgsConstructor
@AllArgsConstructor
public class Adresse {
    @Id @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;
    private String rue;
    private String ville;
    private String codePostal;
}
