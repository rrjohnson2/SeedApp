package com.jsware.Seed.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@SequenceGenerator(name = "seed_seq", initialValue = 1)
public class Seed {
	@Id
	@JsonIgnore
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seed_seq")
	private long id;
	
	
	@Column(unique = true, length = 50)
	private String email;
	
	private String reason;

}
