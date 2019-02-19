package com.mappings;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="UserDetails")
public class UserDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userID;
	
	@Column(name="User_Name")
	private String userName;
	
	/*@OneToOne                                           one to one
	@JoinColumn(name = "Vehicle_ID")
	private Vehicle vehicle;
	*/
	//@OneToMany(mappedBy = "user")
	//@JoinTable(name = "USER_VEHICLE", joinColumns = @JoinColumn (name= "USER_ID"), inverseJoinColumns = @JoinColumn(name = "VEHICLE_ID"))
	
	@ManyToMany
	private List<Vehicle> vehicleList = new ArrayList<>();
		
	public UserDetails(String userName) {
			this.userName = userName;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
/*	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}*/
	public List<Vehicle> getVehicleList() {
		return vehicleList;
	}
	public void setVehicleList(List<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}

	
	
	
	
	

}
