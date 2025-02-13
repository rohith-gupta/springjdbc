package com.springjdbc.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.dao.ParticlesDao;
import com.springjdbc.dao.ParticlesImpl;
import com.springjdbc.entities.Particles;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbc/springjdbc/config.xml");
        
        //JdbcTemplate temp = (JdbcTemplate) context.getBean("jdbcTemplate");
        
        // here jdbc template has automatically created connection using config file and it will close the connection automatically
        
        
        
        
        
        // to insert, update, delete the entry we need to use update method of JDBC template class
        
        ParticlesDao pd = (ParticlesDao) context.getBean("particlesImpl");
        
        Particles particle = new Particles();
        
//        particle.setPartId(5);
//        particle.setPartName("testing new 1");
//        particle.setPartDescription("its a new test");
//        particle.setPrice(5);
//        particle.setDateStart("2025-02-12");
//        particle.setVendorId(5);
//        
//        int result = pd.insert(particle);
//        
//        
//        
//        System.out.println(result);
//        
        // inserted data to entity class using getbean and then retrieved data at data dao layer then 
        // inserted into query using update method and then fired query using jdbc template 
        // which opens connection, fires the query and closes the connection.
        
        
        // below is for update query
//        particle.setPartId(4);
//        particle.setPartName("new Sample");
//        particle.setPartDescription("Testing the update query");
//        
//        int result = pd.update(particle);
//        
//        System.out.println(result);
        
        
        // below is for delete query
        particle.setPartId(3);
        
        int result = pd.delete(particle);
        
        System.out.println(result);
    }
}
