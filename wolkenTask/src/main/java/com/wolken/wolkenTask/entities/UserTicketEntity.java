package com.wolken.wolkenTask.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
public class UserTicketEntity{
	
	@Id
	@Column(name="id")
	private int userId;
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
	@Column
	private String subject;
	@Column
	private String description;
	@Column
	@Setter(value = AccessLevel.NONE)
	private int productId;	
	public void setProductId(int productId) {
		if(productId!=0)
			this.productId = productId;
	}
	@Column
	@Setter(value = AccessLevel.NONE)
	private int OrderId;
	public void setOrderId(int orderId) {
		if(orderId!=0)
			this.OrderId = orderId;
	}
	@Column
	private String type;
	@Column
	private int cId;
	@Column
	private String productName;
	@Column
	@Setter(value = AccessLevel.NONE)
	private int agentId;
	public void setAgentId(int agentId) {
		if(agentId!=0)
			this.agentId = agentId;
	}
	@Column
	private String status;
	@Column
	private String priority;
}