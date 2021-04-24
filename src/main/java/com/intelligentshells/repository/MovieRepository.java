package com.intelligentshells.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.intelligentshells.model.Movie;

public interface MovieRepository extends MongoRepository<Movie, String> {

}
