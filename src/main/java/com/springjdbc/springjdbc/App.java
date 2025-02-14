package com.springjdbc.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
        
        
        
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        
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
//        particle.setPartId(3);
//        
//        int result = pd.delete(particle);
//        
//        System.out.println(result);
        
//        particle = pd.getonerow(5);
//        
//        System.out.println(particle);
        
        // to fetch the single row we need to use queryforobject method from jdbc template then we need to pass reference of rowmapper class to the template argument
        // to pass the reference of rowmapper we need to create an implementation class for rowmapper interface then we need to
        // insert the data using resultset by creating the entity object.
        
//        particle = pd.getonerow("sample2");
//        
//        System.out.println(particle);
        
        List<Particles> particles = pd.getAllrows();
        
        for(Particles p: particles)
        {
        	System.out.println(p);
        }
    }
}
