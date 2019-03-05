package com.moly.entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "route")
public class Route {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id;

	private String routeName;


	private String stationFrom;


	private String stationTo;

}
