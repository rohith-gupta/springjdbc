package com.springjdbc.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        int result =0;
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbc/springjdbc/config.xml");
        
        JdbcTemplate temp = (JdbcTemplate) context.getBean("jdbcTemplate");
        
        // here jdbc template has automatically created connection using config file and it will close the connection automatically
        
        String query = "INSERT INTO Particles(PartID, PartName, PartDescription, Price, DateStart, VendorID) VALUES(?, ?, ?, ?, ?, ?)";
        
        result = temp.update(query, 4, "sample4", "testing4", 4.0, "2025-02-12", 4);
        
        // to insert, update, delete the entry we need to use update method of JDBC template class
        
        System.out.println(result);
        
    }
}
