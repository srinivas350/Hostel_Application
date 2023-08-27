package com.room.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pinCode;
	@Column(name="State")
	private String state;
	@Column(name="District")
	private String district;
	@Column(name="Village")
	private String village;
	@Column(name="Father_Name")
	private String fatherName;
	@Column(name="Mother_Name")
	private String motherName;
	@Column(name="House_NO")
	private String houseNo;
	@Column(name="Parent_Number")
	private long parentNumber;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public long getParentNumber() {
		return parentNumber;
	}
	public void setParentNumber(long parentNumber) {
		this.parentNumber = parentNumber;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public Address(String state, String district, String village, String fatherName, String motherName, String houseNo,
			long parentNumber, int pinCode) {
		super();
		this.state = state;
		this.district = district;
		this.village = village;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.houseNo = houseNo;
		this.parentNumber = parentNumber;
		this.pinCode = pinCode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", district=" + district + ", village=" + village + ", fatherName="
				+ fatherName + ", motherName=" + motherName + ", houseNo=" + houseNo + ", parentNumber=" + parentNumber
				+ ", pinCode=" + pinCode + "]";
	}
	
	

}
