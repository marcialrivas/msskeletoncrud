package com.intelligentshells.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.HashSet;
import java.util.Set;



@Data
@NoArgsConstructor
@RestResource
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Movie {
	
	@Id
	String id;
	String name;
	String movieId;
	@DBRef
    Set<Genre> genres = new HashSet<>();
	@DBRef
    Set<Cast> cast = new HashSet<>();
	@DBRef
    Set<Crew> crew = new HashSet<>();

}
