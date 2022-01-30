package com.app.employeeapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    private String nom;
    private String prenom;
    private double salire;
    private boolean contractuelle;
    private String typeContrat;
    private Date dateEmbauche;
    private String etat;

    @OneToMany (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private java.util.List<Adresse> adresses;
    @OneToMany (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private java.util.List<Phone> phones;

}
