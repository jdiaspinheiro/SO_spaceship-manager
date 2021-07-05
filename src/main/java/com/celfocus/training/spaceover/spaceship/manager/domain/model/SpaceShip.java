package com.celfocus.training.spaceover.spaceship.manager.domain.model;

import com.celfocus.training.spaceover.spaceship.manager.enums.SpaceShipStatus;
import com.celfocus.training.spaceover.spaceship.manager.enums.SpaceShipType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document
public class SpaceShip {

    @Id
    private String id;

    @NotEmpty
    private String name;

    @NotEmpty
    private int maxOcuppancy;

    @NotNull
    private SpaceShipStatus spaceShipStatus;

    @NotNull
    private SpaceShipType spaceShipType;

    @NotEmpty
    private String spaceFleetId;
}
