package org.lucky.nay.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class UserDTO {
	private int id;
	private String name;
	private String email;
	private long contactNo;
	private String gender;
	private String city;
	private String petName;
}
