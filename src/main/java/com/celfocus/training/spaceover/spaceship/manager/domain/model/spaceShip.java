package com.celfocus.training.spaceover.spaceship.manager.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class spaceShip {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;

    @NotEmpty
    private String status;

    @NotEmpty
    private int maxOcuppancy;

    @NotEmpty
    private String type;
}
