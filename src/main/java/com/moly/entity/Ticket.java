package com.moly.entity;

import javax.persistence.*;

@Entity
@Table(name = "ticket")
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id;

	private String ticketCategore;

	//private User user;

	//private FareCategory fareCategore;

	//private  Compartment compartment;

	//private  SeatOrCabin seatOrCabin;

	//private Route route;
}
