package com.intelligentshells.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.rest.core.annotation.RestResource;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@RestResource
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Character {

	@Id
	String id;
	String value;
}
