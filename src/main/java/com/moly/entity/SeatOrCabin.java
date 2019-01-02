package com.moly.entity;

import javax.persistence.*;

@Entity
@Table(name = "seat")
public class SeatOrCabin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id;

	private String seatNo;



	//private Compartment compartment;


   //private Class aClass;

}
