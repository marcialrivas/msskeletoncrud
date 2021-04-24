package com.intelligentshells.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.intelligentshells.model.Cast;

public interface CastRepository extends MongoRepository<Cast, String> {

}
