package com.wolken.wolkenTask.dto;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class UserTicketDTO {
	private String firstName;
	private String lastName;
	private String email;
	private Date dob;
	private String gender;
	private long contactNo;
	private String address;
	private String city;
	private String state;
	private String country;
	private int pincode;
	private String maritalStatus;
	private String subject;
	private String description;
	private int productId;	
	private int OrderId;
	private String type;
	private int cId;
	private String productName;
	private int agentId;
	private String status;
	private String priority;
}
