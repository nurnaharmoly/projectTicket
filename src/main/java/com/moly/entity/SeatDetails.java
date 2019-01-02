package com.moly.entity;

import javax.persistence.*;

@Entity
@Table(name = "availableSeats")
public class SeatDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id;

	//private Train train;


	//private Compartment compartment;


	//private SeatOrCabin seatOrCabin;


	private Boolean status;


}
