package com.hms.model;

public class AppointmentFix {
	
	private int couponNumber;
	private String date;
	private int slot;
	private String patientName;
	private int age;
	private String gender;
	private String address;
	private int phoneNumber;
	private String illness;
	
	public AppointmentFix() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppointmentFix(int couponNumber, String date, int slot, String patientName, int age, String gender,
			String address, int phoneNumber, String illness) {
		super();
		this.couponNumber = couponNumber;
		this.date = date;
		this.slot = slot;
		this.patientName = patientName;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.illness = illness;
	}

	public int getCouponNumber() {
		return couponNumber;
	}

	public void setCouponNumber(int couponNumber) {
		this.couponNumber = couponNumber;
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

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getIllness() {
		return illness;
	}

	public void setIllness(String illness) {
		this.illness = illness;
	}

	@Override
	public String toString() {
		return "AppointmentFix [couponNumber=" + couponNumber + ", date=" + date + ", slot=" + slot + ", patientName="
				+ patientName + ", age=" + age + ", gender=" + gender + ", address=" + address + ", phoneNumber="
				+ phoneNumber + ", illness=" + illness + "]";
	}
	
	
	
	
}
