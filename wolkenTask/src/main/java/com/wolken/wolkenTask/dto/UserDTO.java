package com.wolken.wolkenTask.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class UserDTO {
	private String firstName;
	private String lastName;
	private String email;
	private String dob;
	private String gender;
	private long contactNo;
	private String address;
	private String city;
	private String state;
	private String country;
	private int pincode;
	private String maritalStatus;
}

