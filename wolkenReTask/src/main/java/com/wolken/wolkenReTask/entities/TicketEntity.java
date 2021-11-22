package com.wolken.wolkenReTask.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table
public class TicketEntity{
	@Id
	@GenericGenerator(name="gen", strategy = "increment")
	@GeneratedValue(generator = "gen")
	@Column
	private int ticketId;
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
	private String agentName;
	@Column
	private String type;
	@Column
	private String queries;
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
	@ManyToOne(targetEntity = UserEntity.class)
	@JoinColumn(name="customerId")
	@JsonIgnoreProperties("tickets")
	@Getter(value=AccessLevel.NONE)
	private UserEntity user;
//	
	@JsonBackReference
	public UserEntity getUser() {
		return user;
	}
}
