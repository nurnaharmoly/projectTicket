package com.moly.entity;

import javax.persistence.*;

@Entity
@Table(name = "train")
public class Train {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "train_name")
    private String trainName;


    private int trainNo;
    @ManyToOne
    @JoinColumn(name = "sheduleTime_id")
    private ScheduleTime sheduleTime;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;
    @ManyToOne
    @JoinColumn(name = "station_id")
    private Station station;


}
