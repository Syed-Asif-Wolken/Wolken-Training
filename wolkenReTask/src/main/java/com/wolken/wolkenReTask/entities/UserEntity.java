package com.wolken.wolkenReTask.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

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

public class UserEntity implements Serializable{
	@Id
	@GenericGenerator(name="gen", strategy = "increment")
	@GeneratedValue(generator = "gen")
	@Column
	private int id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String email;
	@Column
	private LocalDate dob;
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

	@OneToMany(mappedBy = "user")
//	@JoinColumn(name="user_id", referencedColumnName = "id")
	@JsonIgnore
	private List<TicketEntity> tickets;
}
