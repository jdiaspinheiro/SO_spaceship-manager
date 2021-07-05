package com.celfocus.training.spaceover.spaceship.manager.repository;

import com.celfocus.training.spaceover.spaceship.manager.domain.model.SpaceShip;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpaceShipRepository extends MongoRepository<SpaceShip, String> {
}
