package com.celfocus.training.spaceover.spaceship.manager.controller;

import com.celfocus.training.spaceover.spaceship.manager.domain.request.SpaceShipRequest;
import com.celfocus.training.spaceover.spaceship.manager.domain.response.SpaceShipResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SpaceFleetController {

    ResponseEntity<List<SpaceShipResponse>> getSpaceShips();

    ResponseEntity<SpaceShipResponse> getSpaceship(String id);

    ResponseEntity createSpaceShip(SpaceShipRequest request);

    ResponseEntity<SpaceShipResponse> updateSpaceShip(SpaceShipRequest request, String id);

    ResponseEntity deleteSpaceShip(String id);
}
