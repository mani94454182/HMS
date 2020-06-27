package com.hms;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import com.hms.SpringBeanConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class DispatcherServletConfig implements WebApplicationInitializer{
	
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		// Step 1: Enable Web IoC Container

		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();

		// Step 2 : Register the Spring Web Configuration Class.

		context.register(SpringBeanConfig.class);
	
		// Step 3: Activate the Dispatcher Servlet

		ServletRegistration.Dynamic servletRegistration = servletContext.addServlet("ds",
				new DispatcherServlet(context));

		// Step 4: Load On Startup
		servletRegistration.setLoadOnStartup(1);

		// Step 5: Set the Url Pattern
		servletRegistration.addMapping("/");

	}
}
