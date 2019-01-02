package com.moly.entity;

import javax.persistence.*;

@Entity
@Table(name = "station")
public class Station {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id;

	private String stationName;

	private String adress;



}
