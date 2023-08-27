package com.room.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Room")
public class Room {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int roomNumber;
	@Column(name="Room_Type")
	private String roomType;
	@Column(name="Room_Price")
	private float roomPrice;
	@Column(name="Room_Share")
	private int roomShare;
	@Column(name="vaccancies")
	private int vaccancies;
	/**
	 * @return the roomNumber
	 */
	public int getRoomNumber() {
		return roomNumber;
	}
	public int getVaccancies() {
		return vaccancies;
	}
	public void setVaccancies(int vaccancies) {
		this.vaccancies = vaccancies;
	}
	/**
	 * @param roomNumber the roomNumber to set
	 */
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	/**
	 * @return the roomType
	 */
	public String getRoomType() {
		return roomType;
	}
	/**
	 * @param roomType the roomType to set
	 */
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	/**
	 * @return the roomPrice
	 */
	public float getRoomPrice() {
		return roomPrice;
	}
	/**
	 * @param roomPrice the roomPrice to set
	 */
	public void setRoomPrice(float roomPrice) {
		this.roomPrice = roomPrice;
	}
	/**
	 * @return the roomShare
	 */
	public int getRoomShare() {
		return roomShare;
	}
	/**
	 * @param roomShare the roomShare to set
	 */
	public void setRoomShare(int roomShare) {
		this.roomShare = roomShare;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	public Room(int roomNumber, String roomType, float roomPrice, int roomShare,int vaccancies) {
		super();
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
		this.roomShare = roomShare;
		this.vaccancies=vaccancies;
	}
	@Override
	public String toString() {
		return "Room [roomNumber=" + roomNumber + ", roomType=" + roomType + ", roomPrice=" + roomPrice + ", roomShare="
				+ roomShare + ", vaccancies=" + vaccancies + "]";
	}
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
