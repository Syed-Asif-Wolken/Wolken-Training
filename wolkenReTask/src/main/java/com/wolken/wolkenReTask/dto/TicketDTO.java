package com.wolken.wolkenReTask.dto;

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
	private String type;
	private String status;
	private String priority;
	private String agentName;
//	@JsonIgnoreProperties("tickets")
//	private UserEntity user;
}
