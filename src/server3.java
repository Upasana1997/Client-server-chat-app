
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.PreparedStatement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class server3 {
    public server3()
            {
               try
               {
            ServerSocket s1=new ServerSocket(4039);
            System.out.println("server has started");
            Socket s2=s1.accept();
            DataInputStream d=new DataInputStream(s2.getInputStream());
            DataOutputStream o=new DataOutputStream(s2.getOutputStream()); 
            String f,l,e,c;
            String q="insert into tbsample(fname,lname,email,contact) values(?,?,?,?)";
            f=d.readUTF();
            l=d.readUTF();
            e=d.readUTF();
            c=d.readUTF();
            myconnection obj=new myconnection();
            PreparedStatement pst=obj.db.prepareStatement(q);
            pst.setString(1,f);
            pst.setString(2,l);
            pst.setString(3,e);
            pst.setString(4,c);
            pst.executeUpdate();
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
        server3 obj=new server3();
    }
}
