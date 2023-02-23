package com.cg.hbm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MyRoomDetails")
public class RoomDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(updatable = false)
	private int roomId;
	@Column(unique = true, updatable = false)
	private String roomNo;
	private String roomType;
	private double ratePerDay;
	private boolean isAvailable;
	
	public RoomDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public double getRatePerDay() {
		return ratePerDay;
	}
	public void setRatePerDay(double ratePerDay) {
		this.ratePerDay = ratePerDay;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public RoomDetails(String roomNo, String roomType, double ratePerDay, boolean isAvailable) {
		super();
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.ratePerDay = ratePerDay;
		this.isAvailable = isAvailable;
	}
	


	

	

	
	
	
	
	
}
