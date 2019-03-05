package com.moly.entity;

import javax.persistence.*;

@Entity
@Table(name = "seat")
public class SeatOrCabin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id;

	private int seatNo;

	private int cabinNo;



	@ManyToOne
	@JoinColumn(name = "compartment_id")
	private Compartment compartment;


	@ManyToOne
	@JoinColumn(name = "trainClass_id")
	private TrainClass trainClass;

}
