package com.moly.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "shedule_time")
public class ScheduleTime {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id;


	@Temporal(TemporalType.TIME)
	private Date startTime;

	@Temporal(TemporalType.TIME)
	private Date arrivalTime;




}
