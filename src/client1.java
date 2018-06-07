
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class client1 {
    public client1()
    {
        try
        {
            double r,area;
            Socket s1=new Socket("127.0.0.1",4019);
            DataInputStream d=new DataInputStream(s1.getInputStream());
            DataOutputStream o=new DataOutputStream(s1.getOutputStream());
            Scanner s2=new Scanner(System.in);
            System.out.println("enter radius");
            r=s2.nextDouble();
            o.writeDouble(r);
            area=d.readDouble();
            System.out.println("Area is "+area);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String args[])
    {
        client1 obj=new client1();
    }
}
