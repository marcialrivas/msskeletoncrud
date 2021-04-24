package com.intelligentshells.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.intelligentshells.model.Character;


public interface CharacterRepository extends MongoRepository<Character, String> {

}
