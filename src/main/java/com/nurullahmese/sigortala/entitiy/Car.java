package com.nurullahmese.sigortala.entitiy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "modelYear")
    private int modelYear;

    @Column(name = "brand")
    private String brand;

    @Column(name = "typeOfUse")
    private String typeOfUse;

    @Column(name = "Usage")
    private String usage;

    @Column(name = "model")
    private String model;

    @Column(name = "modelDetail")
    private String modelDetail;

    @Column(name = "modelNumber")
    private String modelNumber;

    @Column(name = "chassisDetail")
    private String chassisDetail;

    @Column(name = "registrationDate")
    private String registrationDate;

}