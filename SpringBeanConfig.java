package com.hms;



import java.util.Properties;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages= {"com.hms"})
@PropertySource(value = {"classpath://application.properties"})
@EnableWebMvc
@EnableTransactionManagement
public class SpringBeanConfig {
	

		@Value("${hibernate.connection.driver_class}")
		private String driver_classname;
		
		@Value("${hibernate.connection.url}")
		private String url;
		
		@Value("${hibernate.connection.username}")
		private String username;
		
		@Value("${hibernate.connection.password}")
		private String password;
		
		@Value("${hibernate.show_sql}")
		private String show_sql;
		
		@Value("${hibernate.dialect}")
		private String dialect;
		
		@Value("${hibernate.hbm2ddl.auto}")
		private String ddlauto;
		
		@Value("${entity.packagestoscan}")
		private String packagesToScan;
		
		@Bean
		public LocalSessionFactoryBean getSessionFactory() {
			
			LocalSessionFactoryBean obj = new LocalSessionFactoryBean();
			
			obj.setPackagesToScan(packagesToScan);
			obj.setDataSource(getDataSource());
			
			Properties hibernateProperties = new Properties();
			
			hibernateProperties.setProperty("hibernate.show_sql", show_sql);
			hibernateProperties.setProperty("hibernate.dialect",dialect);
			hibernateProperties.setProperty("hibernate.hbm2ddl.auto",ddlauto);
			//System.out.println(show_sql);
			obj.setHibernateProperties(hibernateProperties);
			
			return obj;
		
		}
		
		@Bean
		public DataSource getDataSource() {
			DataSource dataSource = new DataSource();
			dataSource.setDriverClassName(driver_classname);
			dataSource.setPassword(password);
			dataSource.setUrl(url);
			dataSource.setUsername(username);
			return dataSource;
		}


		@Bean
		public HibernateTransactionManager getTransactionManager() {
			HibernateTransactionManager txm =  new HibernateTransactionManager();
			//Return an instance (possibly shared or independent) of the object managed by this factory
			txm.setSessionFactory(getSessionFactory().getObject());
				
			return txm;
		}
		
		
	@Bean
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver irvr = new InternalResourceViewResolver();
		irvr.setPrefix("/WEB-INF/views/");
		irvr.setSuffix(".jsp");
		return irvr;
				
		
	}

}
