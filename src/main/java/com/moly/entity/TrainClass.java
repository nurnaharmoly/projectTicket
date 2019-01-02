package com.moly.entity;

import javax.persistence.*;

@Entity
@Table(name = "class")
public class TrainClass {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id;

	private String className;



}
