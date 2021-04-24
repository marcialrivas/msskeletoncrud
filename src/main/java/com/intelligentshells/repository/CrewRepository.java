package com.intelligentshells.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.intelligentshells.model.Crew;

public interface CrewRepository extends MongoRepository<Crew, String> {

}
