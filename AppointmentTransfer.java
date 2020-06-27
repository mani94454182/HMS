package com.hms.model;

public class AppointmentTransfer {
	private String date;
	private int slot;
	private int doctorId;
	
	
	public AppointmentTransfer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AppointmentTransfer(String date, int slot, int doctorId) {
		super();
		this.date = date;
		this.slot = slot;
		this.doctorId = doctorId;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public int getSlot() {
		return slot;
	}


	public void setSlot(int slot) {
		this.slot = slot;
	}


	public int getDoctorId() {
		return doctorId;
	}


	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}


	@Override
	public String toString() {
		return "AppointmentTransfer [date=" + date + ", slot=" + slot + ", doctorId=" + doctorId + "]";
	}
	
	
	
	
	

}
