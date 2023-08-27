package com.room.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Room_Mates")
public class RoomMate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int RoomID;
	@Column(name="Mobile_Number")
	private long mobileNumber;
	@Column(name="RoomMate_Namme")
	private String roomMateName;
	@Column(name="Advance")
	private int advance;
	@Column(name="Room_Number")
	private String roomNumber;
	@OneToOne
	private Address roomMateAddress;
	/**
	 * @return the mobileNumber
	 */
	public long getMobileNumber() {
		return mobileNumber;
	}
	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	/**
	 * @return the roomMateName
	 */
	public String getRoomMateName() {
		return roomMateName;
	}
	/**
	 * @param roomMateName the roomMateName to set
	 */
	public void setRoomMateName(String roomMateName) {
		this.roomMateName = roomMateName;
	}
	/**
	 * @return the advance
	 */
	public int getAdvance() {
		return advance;
	}
	/**
	 * @param advance the advance to set
	 */
	public void setAdvance(int advance) {
		this.advance = advance;
	}
	/**
	 * @return the roomNumber
	 */
	public String getRoomNumber() {
		return roomNumber;
	}
	/**
	 * @param roomNumber the roomNumber to set
	 */
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RoomMate [mobileNumber=" + mobileNumber + ", roomMateName=" + roomMateName + ", roomMateAddress="
				+ roomMateAddress + ", advance=" + advance + ", roomNumber=" + roomNumber + "]";
	}
	public RoomMate(long mobileNumber, String roomMateName, Address roomMateAddress, int advance, String roomNumber) {
		super();
		this.mobileNumber = mobileNumber;
		this.roomMateName = roomMateName;
		this.roomMateAddress = roomMateAddress;
		this.advance = advance;
		this.roomNumber = roomNumber;
	}
	
	
	

}
