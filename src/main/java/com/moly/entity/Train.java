package com.moly.entity;

import javax.persistence.*;

@Entity
@Table(name = "train")
public class Train {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id;

	@Column(name = "train_name")
	private String trainName;


	private  int trainNo;

   // private ScheduleTime sheduleTime;


   // private Route route;

    //private Station station;



}
