package com.hms.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hms.entities.PatientEntity;
import com.hms.model.LoginPage;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Object;



@Repository
public class LoginPageDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	
	/*
	 * public PatientEntity getAllEvent(int patientPassword) { Session session =
	 * sessionFactory.openSession(); PatientEntity patient
	 * =session.get(PatientEntity.class, patientPassword); return patient; }
	 * 
	 */ 
	  public boolean getLoginDetails(LoginPage loginPage) {
		  Session session = sessionFactory.openSession();
	  PatientEntity patientEntity = session.get(PatientEntity.class, loginPage.getPassword()); //get(PatientEntity.class,
	 boolean result = false;
	  	if(patientEntity!=null && patientEntity.getPatientUserName().equals(loginPage.getUserName())) {
	  		result = true;
	  	}
	 
	 return result;

	  }
	 
	


}
