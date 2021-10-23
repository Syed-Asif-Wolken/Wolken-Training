package com.wolken.hackerrank.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserDTO {
	private int id;
	private String username;
	private String email;
	private long contactNumber;
	private String dob;
	private String password;
	private String cnfPassword;
}
