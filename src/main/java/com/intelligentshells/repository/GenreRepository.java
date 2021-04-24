package com.intelligentshells.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.intelligentshells.model.Genre;

public interface GenreRepository extends MongoRepository<Genre, String> {

}
