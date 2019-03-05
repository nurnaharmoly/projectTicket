package com.moly.entity;

import javax.persistence.*;

@Entity
@Table(name = "ticket")
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id;

	private String ticketCategore;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	@ManyToOne
	@JoinColumn(name = "fareCategore_id")
	private FareCategory fareCategore;
	@ManyToOne
	@JoinColumn(name = "compartment_id")
	private Compartment compartment;

	@ManyToOne
	@JoinColumn(name = "seatOrCabin_id")
	private  SeatOrCabin seatOrCabin;
	@ManyToOne
	@JoinColumn(name = "route_id")
	private Route route;
}
