package com.intelligentshells.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.intelligentshells.model.Role;

public interface RoleRepository extends MongoRepository<Role, String> {

}
