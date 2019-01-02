package com.moly.entity;

import javax.persistence.*;

@Entity
@Table(name = "fare")
public class FareCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id;

	private String fareCategoreName;
}
