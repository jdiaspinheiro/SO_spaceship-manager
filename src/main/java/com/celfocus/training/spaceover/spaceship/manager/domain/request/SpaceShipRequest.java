package com.celfocus.training.spaceover.spaceship.manager.domain.request;

import com.celfocus.training.spaceover.spaceship.manager.enums.SpaceShipStatus;
import com.celfocus.training.spaceover.spaceship.manager.enums.SpaceShipType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SpaceShipRequest {

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
