
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class server1 {
   public server1()
   {
       try
       {
           ServerSocket s1=new ServerSocket(4019);
           System.out.println("server has started");
           Socket s2=s1.accept();
           DataInputStream d=new DataInputStream(s2.getInputStream());
           DataOutputStream o=new DataOutputStream(s2.getOutputStream());
           double r,area;
           r=d.readDouble();
           area=3.14*r*r;
           o.writeDouble(area);
           s2.close();
           d.close();
           o.close();
       }
       catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
   }
   public static void main(String args[])
   {
       server1 obj=new server1();
   }
}
