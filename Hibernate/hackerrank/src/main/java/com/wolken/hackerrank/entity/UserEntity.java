package com.wolken.hackerrank.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@Entity
@Table(name = "user_details")
@NamedQueries({
	@NamedQuery(name="getByEmailId", query="from UserEntity where email = :email")
})
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
	private String password;
	@Column
	private String cnfPassword;
}
