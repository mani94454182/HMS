package com.hms.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="patientlogindetails")
public class PatientEntity {
	

	private String patientUserName;
	@Id
	private int patientPassword;
	
	
	public PatientEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PatientEntity(String patientUserName, int patientPassword) {
		super();
		this.patientUserName = patientUserName;
		this.patientPassword = patientPassword;
	}


	public String getPatientUserName() {
		return patientUserName;
	}


	public void setPatientUserName(String patientUserName) {
		this.patientUserName = patientUserName;
	}


	public int getPatientPassword() {
		return patientPassword;
	}


	public void setPatientPassword(int patientPassword) {
		this.patientPassword = patientPassword;
	}


	@Override
	public String toString() {
		return "PatientEntity [patientUserName=" + patientUserName + ", patientPassword=" + patientPassword + "]";
	}
	

}
