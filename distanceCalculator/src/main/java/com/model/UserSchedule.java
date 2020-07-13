package com.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="USER_SCHDULE")
public class UserSchedule {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getDistance() {
		return distance;
	}

	public void setDistance(Float distance) {
		this.distance = distance;
	}

	public Date getWhen() {
		return when;
	}

	public void setWhen(Date when) {
		this.when = when;
	}

	public String getTimeTaken() {
		return TimeTaken;
	}

	public void setTimeTaken(String timeTaken) {
		TimeTaken = timeTaken;
	}

	@Column(name="NAME")
	private String name;
	
	@Column(name="DISTANCE_TRAVELLED")
	private Float distance;   // in km
	
	@Column(name="WHEN_TRAVELLED")
	@Temporal(TemporalType.TIMESTAMP)
	private Date when;
	
	@Column(name="TIME_TAKEN")
	private String TimeTaken;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name="USR_NAME" ,nullable=false)
	private String userName;

}
