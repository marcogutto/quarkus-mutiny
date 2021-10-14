package com.star.wars.domain.dto;

import java.util.List;

import io.quarkus.runtime.annotations.RegisterForReflection;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)

@RegisterForReflection
public class PeopleDTO {

    private String name;
	private String height;
	private String mass;
	private String hair_color;
	private String skin_color;
	private String eye_color;
	private String birth_year;
	private String gender;
	private String homeworld;
    private List<String> films;
	private List<String> species;
	private List<String> vehicles;
	private List<String> starships;
	private String created;
	private String edited;
	private String url;
}
