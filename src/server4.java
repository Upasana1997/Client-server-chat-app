
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
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
public class server4 {
    public server4()
    {
        try
        {
            ServerSocket s1=new ServerSocket(4079);
            System.out.println("server has started");
            Socket s2=s1.accept();
            DataInputStream d=new DataInputStream(s2.getInputStream());
            DataOutputStream o=new DataOutputStream(s2.getOutputStream()); 
            String msg,result;
            Scanner s3=new Scanner(System.in);
            do
            {
            msg=d.readUTF();
            System.out.println("message is:"+msg);
            System.out.println("Reply:");
            result=s3.nextLine();
            o.writeUTF(result);
            }
            while(!(result.equals("stop")));
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
                server4 obj=new  server4();
            }
}
