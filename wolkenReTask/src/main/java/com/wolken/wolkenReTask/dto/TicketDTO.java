package com.wolken.wolkenReTask.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wolken.wolkenReTask.entities.UserEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class TicketDTO {
	private String subject;
	private String description;
	private int productId;
	private String productName;
	private int agentId;
	private String queries;
	private String type;
	private String status;
	private String priority;
	private String agentName;
	@JsonIgnoreProperties("tickets")
	private UserEntity user;
}
