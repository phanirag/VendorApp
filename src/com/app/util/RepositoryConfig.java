package com.app.util;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;


@Configuration
public class RepositoryConfig {
	  //${jdbc.driverClassName}
    @Value("${jdbc.driver}")     		private String driverClassName;
    @Value("${jdbc.url}")               private String url;
    @Value("${jdbc.name}")             	private String username;
    @Value("${jdbc.pass}")             	private String password;

    
    @Value("${hibernate.dialect}")      private String hibernateDialect;
    @Value("${hibernate.show_sql}")     private String hibernateShowSql;
    @Value("${hibernate.hbm2ddl.auto}") private String hibernateHbm2ddlAuto;
    @Value("${hibernate.format_sql}")	private String hibernateformatsql;
    @Value("${hibernate.validator.apply_to_ddl}")
    									private String validatorapplytoddl;
    @Value("${hibernate.validator.autoregister_listeners}")
    									private String autoregisterlisterner;
    @Value("${hibernate.generate_statistics}")
    									private String generateStatics;
    @Bean()    
    public DataSource getDataSource()
    {
        DriverManagerDataSource ds = new DriverManagerDataSource();        
        ds.setDriverClassName(driverClassName);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);        
        return ds;
    }
    
    @Bean
    @Autowired
    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory)
    {
        HibernateTransactionManager htm = new HibernateTransactionManager();
        htm.setSessionFactory(sessionFactory);
        return htm;
    }
    
    @Bean
    @Autowired
    public HibernateTemplate getHibernateTemplate(SessionFactory sessionFactory)
    {
        HibernateTemplate hibernateTemplate = new HibernateTemplate(sessionFactory);
        return hibernateTemplate;
    }
        
    @Bean
    public Properties getHibernateProperties()
    {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", hibernateDialect);
        properties.put("hibernate.show_sql", hibernateShowSql);
        properties.put("hibernate.hbm2ddl.auto", hibernateHbm2ddlAuto);
        properties.put("hibernate.generate_statistics", generateStatics);
        properties.put("hibernate.validator.apply_to_ddl", validatorapplytoddl);
        properties.put("hibernate.validator.autoregister_listeners", autoregisterlisterner);
        properties.put("hibernate.format_sql", hibernateformatsql);
        return properties;
    }

    @Bean
    public AnnotationSessionFactoryBean getSessionFactory()
    {
        AnnotationSessionFactoryBean asfb = new AnnotationSessionFactoryBean();
        asfb.setDataSource(getDataSource());
        asfb.setHibernateProperties(getHibernateProperties());        
        asfb.setPackagesToScan(new String[]{"com.app.modal"});
        return asfb;
    }

    
}
