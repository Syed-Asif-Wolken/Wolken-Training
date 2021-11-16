package com.wolken.wolkenTask.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
@ToString
public class UserEntity {
	@Id
	@GenericGenerator(name="gen",strategy="increment")
	@GeneratedValue(generator="gen")
	@Column
	private int id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String email;
	@Column
	private Date dob;
	@Column
	private String gender;
	@Column
	@Setter(value = AccessLevel.NONE)
	private long contactNo;
	public void setContactNo(long contactNo) {
		if(contactNo!=0)
			this.contactNo = contactNo;
	}
	@Column
	private String address;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private String country;
	@Column
	@Setter(value = AccessLevel.NONE)
	private int pincode;
	public void setPincode(int pincode) {
		if(pincode!=0)
			this.pincode = pincode;
	}
	@Column
	private String maritalStatus;
}
