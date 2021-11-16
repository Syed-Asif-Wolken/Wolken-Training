package com.wolken.wolkenTask.entities;

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
@ToString
@Entity
@Table
public class TicketEntity {
	@Id
	@GenericGenerator(name="gen",strategy="increment")
	@GeneratedValue(generator="gen")
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
	@Setter(value = AccessLevel.NONE)
	private int OrderId;
	public void setOrderId(int orderId) {
		if(orderId!=0)
			this.OrderId = orderId;
	}
	@Column
	private String type;
	@Column
	@Setter(value = AccessLevel.NONE)
	private int cId;
	public void setcId(int cId) {
		if(cId!=0)
			this.cId = cId;
	}
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
