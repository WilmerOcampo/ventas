package com.wo.ventas.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "employees")
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeid;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "title")
    private String title;
    @Column(name = "titleofcourtesy")
    private String titleofcourtesy;
    @Column(name = "birthdate")
    private Date birthdate;
    @Column(name = "hiredate")
    private Date hiredate;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "region")
    private String region;
    @Column(name = "postalcode")
    private String postalcode;
    @Column(name = "country")
    private String country;
    @Column(name = "homephone")
    private String homephone;
    @Column(name = "extension")
    private String extension;
    @Column(name = "notes")
    private String notes;
    private Integer reportsto;
    private String photopath;
    private Double salary;
}
