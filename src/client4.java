
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
public class client4 {
    public client4()
    {
        try
        {
            Socket s1=new Socket("127.0.0.1",4079);
            DataInputStream d=new DataInputStream(s1.getInputStream());
            DataOutputStream o=new DataOutputStream(s1.getOutputStream());
            Scanner s2=new Scanner(System.in);
            String msg,result;
            do
            {
                System.out.println("enter message");
                msg=s2.nextLine();
                o.writeUTF(msg);
                result=d.readUTF();
                System.out.println("reply is:"+result);
            }
            while(!(msg.equals("stop")));
        }  
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String args[])
    {
        client4 obj=new client4();
    }
}
