package com.celfocus.training.spaceover.spaceship.manager.controller;

import com.celfocus.training.spaceover.spaceship.manager.domain.model.SpaceShip;
import com.celfocus.training.spaceover.spaceship.manager.domain.request.SpaceShipRequest;
import com.celfocus.training.spaceover.spaceship.manager.domain.response.SpaceShipResponse;
import com.celfocus.training.spaceover.spaceship.manager.service.SpaceShipService;
import com.vodafone.global.smartlife.service.error.v2.ControllerV2;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/spaceship")
@RequiredArgsConstructor
public class SpaceOverSpaceShipController implements SpaceFleetController, ControllerV2 {

    private final ModelMapper modelMapper;
    private final SpaceShipService spaceShipService;

    @GetMapping
    public ResponseEntity<List<SpaceShipResponse>> getSpaceShips() {
        List<SpaceShip> spaceShips = spaceShipService.findAll();
        List<SpaceShipResponse> spaceShipResponses = spaceShips.stream()
                .map(f -> modelMapper.map(f, SpaceShipResponse.class))
                .collect(Collectors.toList());
        return ResponseEntity.ok(spaceShipResponses);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SpaceShipResponse> getSpaceship(@PathVariable String id) {
        return ResponseEntity.ok(modelMapper.map(spaceShipService.findBydId(id), SpaceShipResponse.class));
    }

    @PostMapping
    public ResponseEntity createSpaceShip(@RequestBody SpaceShipRequest request) {
        spaceShipService.save(modelMapper.map(request, SpaceShip.class));
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/{id}")
    public ResponseEntity<SpaceShipResponse> updateSpaceShip(SpaceShipRequest request, String id) {
        return null;
    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteSpaceShip(String id) {
        return null;
    }
}
