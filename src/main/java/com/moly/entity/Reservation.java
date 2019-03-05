package com.moly.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reservation")
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id;

	private String noOffSeats;

	private double totalPrice;

	private double unitPrice;

	private Date journyDate;
	@ManyToOne
	@JoinColumn(name = "ticket_id")
	private Ticket ticket;
	@ManyToOne
	@JoinColumn(name = "compartment_id")
	private Compartment compartment;
	@ManyToOne
	@JoinColumn(name = "train_id")
	private Train train;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;




}
