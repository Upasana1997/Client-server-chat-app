
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class myconnection {
    Connection db;
    
    public myconnection()
    {
        try
        {
            db=DriverManager.getConnection("jdbc:mysql://localhost/dbcliser", "root", "");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
