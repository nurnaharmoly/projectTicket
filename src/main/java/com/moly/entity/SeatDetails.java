package com.moly.entity;

import javax.persistence.*;

@Entity
@Table(name = "availableSeats")
public class SeatDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id;


	@ManyToOne
	@JoinColumn(name = "train_id")
	private Train train;

	@ManyToOne
	@JoinColumn(name = "compartment_id")
	private Compartment compartment;

	@ManyToOne
	@JoinColumn(name = "seatOrCabin_id")
	private SeatOrCabin seatOrCabin;


	private Boolean status;


}
