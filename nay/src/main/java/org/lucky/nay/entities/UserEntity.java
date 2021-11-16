package org.lucky.nay.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

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
public class UserEntity {
	@Id
	@GenericGenerator(name="nay", strategy="increment")
	@GeneratedValue(generator="nay")
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private long contactNo;
	@Column
	private String gender;
	@Column
	private String city;
	@Column
	private String petName;
}
