package com.celfocus.training.spaceover.spaceship.manager.service;

import com.celfocus.training.spaceover.spaceship.manager.domain.model.SpaceShip;
import com.celfocus.training.spaceover.spaceship.manager.repository.SpaceShipRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SpaceOverSpaceShipService implements SpaceShipService {

    private final SpaceShipRepository spaceShipRepository;

    public List<SpaceShip> findAll() {
        return spaceShipRepository.findAll();
    }

    public SpaceShip findBydId(String id) {
        return spaceShipRepository.findById(id).orElseThrow(() -> new DataAccessResourceFailureException("Spacefleet with ID: " + id + ", was not found!"));
    }

    public SpaceShip save(SpaceShip spaceShip) {
        return spaceShipRepository.save(spaceShip);
    }

    public SpaceShip update(SpaceShip spaceShip) {
        return save(spaceShip);
    }

    public void deleteById(String id) {
        spaceShipRepository.deleteById(id);
    }
}
