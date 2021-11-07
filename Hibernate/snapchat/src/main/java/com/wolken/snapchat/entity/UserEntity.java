package com.wolken.snapchat.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@Entity
@Table(name = "user_details")
public class UserEntity {
	@Id
	@Column
	private int id;
	@Column
	private String username;
	@Column
	private String email;
	@Column
	private long contactNumber;
	@Column
	private Date dob;
	@Column
	private String gender;
}
