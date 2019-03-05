package com.moly.entity;

import javax.persistence.*;

@Entity
@Table(name = "compartment")
public class Compartment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id;

	private String compartmentName;

	private int compartmentNo;

	@ManyToOne
	@JoinColumn(name = "train_id")
	private Train train;




}
