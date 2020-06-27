package com.hms.dao;

//import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hms.entities.AppointmentDetails;
import com.hms.model.AppointmentFix;
//import com.hms.model.AppointmentFix;




@Repository
public class AppointmentDetailsDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public boolean createAppointmentDetails(AppointmentFix appointmentFix) {
		
		Session session = sessionFactory.getCurrentSession();
		
	
		AppointmentDetails appoint = new AppointmentDetails(appointmentFix.getCouponNumber()  , appointmentFix.getDate() ,appointmentFix.getSlot(),appointmentFix.getPatientName(),
				appointmentFix.getAge() ,appointmentFix.getGender(),appointmentFix.getAddress(),appointmentFix.getPhoneNumber(),appointmentFix.getIllness());
		
		session.save(appoint) ;
		  
		 
		return true;
	}

}
