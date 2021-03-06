package com.wolken.monument.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Getter
@Setter
@ToString
@Entity
@Table(name = "monument_details")
@NamedQueries({
	@NamedQuery(name="getByEmail", query="from UserEntity where email = :email")
})
@NoArgsConstructor
public class UserEntity {
	@Id
	@Column
	@GenericGenerator(name="gen", strategy="increment")
	@GeneratedValue(generator="gen")
	private int id;
	@Column
	private String name;
	@Column
	private String builder;
	@Column
	private int year;
	@Column
	private String location;
}
