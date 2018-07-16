/**
 * 
 */
package com.tang.demo.bean;

/**
 * @author tangwei
 * @createDate 2018-07-16
 */
public class Elevator {
	
	private Long elevatorID = null;
	private String elevatorName = null;
	private String principal = null;
	
	
	public Elevator() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Elevator(Long elevatorID, String elevatorName, String principal) {
		super();
		this.elevatorID = elevatorID;
		this.elevatorName = elevatorName;
		this.principal = principal;
	}



	public Elevator(Long elevatorID, String elevatorName) {
		super();
		this.elevatorID = elevatorID;
		this.elevatorName = elevatorName;
	}


	public Long getElevatorID() {
		return elevatorID;
	}


	public void setElevatorID(Long elevatorID) {
		this.elevatorID = elevatorID;
	}


	public String getElevatorName() {
		return elevatorName;
	}


	public void setElevatorName(String elevatorName) {
		this.elevatorName = elevatorName;
	}



	public String getPrincipal() {
		return principal;
	}



	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	
	public String toString() {
		return "ElevatorID:" + elevatorID + ", ElevatorName:" + elevatorName + " principal:" + principal;
	}
	
}
