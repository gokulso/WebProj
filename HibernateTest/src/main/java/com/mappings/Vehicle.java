package com.mappings;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="Vehicle")
public class Vehicle {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int vehicleID;
	
	@Column(name="Vehicle_Name")
	private String name;
	
	/*@ManyToOne
	@JoinColumn(name = "USER_ID" )*/     
	
	@ManyToMany(mappedBy = "vehicleList")
	private List<UserDetails> userList = new ArrayList<>();
	
	public Vehicle(String name) {
		this.name = name;
	}
	
	public int getId() {
		return vehicleID;
	}
	public void setId(int vehicleID) {
		this.vehicleID = vehicleID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
   	public List<UserDetails> getUserList() {
		return userList;
	}

	public void setUserList(List<UserDetails> userList) {
		this.userList = userList;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + vehicleID + ", name=" + name + "]";
	}
	
	
	
	

}
