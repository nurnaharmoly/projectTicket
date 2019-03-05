package com.moly.entity;

import javax.persistence.*;

@Entity
@Table(name = "availableSeats")
public class AvailableSeats {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id;

	private int availableSeats;

	private int soldSeats;

	private int totalSeats;

	@ManyToOne
	@JoinColumn(name = "train_id")
	private Train train;

	@ManyToOne
	@JoinColumn(name = "compartment_id")
	private Compartment compartment;


}
