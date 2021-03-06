package com.wolken.monument.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class UserDTO {
	private int id;
	private String name;
	private String builder;
	private int year;
	private String location;
}
