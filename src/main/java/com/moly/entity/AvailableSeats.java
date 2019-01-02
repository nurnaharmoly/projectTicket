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

	//private  Train train;

	//private  Compartment compartment;


}
