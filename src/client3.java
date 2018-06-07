
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
public class client3 {
    public client3()
    {
        try
        {
            String f,l,e,c;
            Socket s1=new Socket("127.0.0.1",4039);
            DataInputStream d=new DataInputStream(s1.getInputStream());
            DataOutputStream o=new DataOutputStream(s1.getOutputStream());
            Scanner s2=new Scanner(System.in);
            System.out.println("enter fname,lname,email,contact");
            f=s2.next();
            l=s2.next();
            e=s2.next();
            c=s2.next();
            o.writeUTF(f);
            o.writeUTF(l);
            o.writeUTF(e);
            o.writeUTF(c);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String args[])
    {
        client3 obj=new client3();
    }
}
