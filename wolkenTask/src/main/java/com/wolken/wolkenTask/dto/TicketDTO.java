package com.wolken.wolkenTask.dto;

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
	private int OrderId;
	private String productName;
	private int agentId;
	private String type;
	private int cId;
	private String status;
	private String priority;
}
