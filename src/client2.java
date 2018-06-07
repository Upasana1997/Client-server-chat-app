
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
public class client2 {
    public client2()
    {
        try
        {
            int x,y,z;
            double avg;
            Socket s1=new Socket("127.0.0.1",4029);
            DataInputStream d=new DataInputStream(s1.getInputStream());
            DataOutputStream o=new DataOutputStream(s1.getOutputStream());
            Scanner s2=new Scanner(System.in);
            System.out.println("enter 3 numbers");
            x=s2.nextInt();
            y=s2.nextInt();
            z=s2.nextInt();
            o.writeInt(x);
            o.writeInt(y);
            o.writeInt(z);
            avg=d.readDouble();
            System.out.println("Average is "+avg);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String args[])
    {
        client2 obj=new client2();
    }
}
