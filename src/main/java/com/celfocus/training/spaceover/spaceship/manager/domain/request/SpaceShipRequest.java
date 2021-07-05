package com.celfocus.training.spaceover.spaceship.manager.domain.request;

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
public class SpaceShipRequest {

    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @NotEmpty
    private String name;

    @NotNull
    private SpaceShipStatus spaceShipStatus;

    @NotEmpty
    private int maxOcuppancy;

    @NotNull
    private SpaceShipType spaceShipType;

}
