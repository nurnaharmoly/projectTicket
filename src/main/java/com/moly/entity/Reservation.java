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

	//private Ticket ticket;

	//private Compartment compartment;

	//private Train train;

	//private User user;




}
