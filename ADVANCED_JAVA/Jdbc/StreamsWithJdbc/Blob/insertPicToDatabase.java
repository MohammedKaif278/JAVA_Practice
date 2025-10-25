package Jdbc.StreamsWithJdbc.Blob;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertPicToDatabase
{
    String driver="oracle.jdbc.OracleDriver";
    String Dburl="jdbc:oracle:thin:@localhost:1521:orcl";
    String DbUname="ADVJAVA";
    String Dbpwd="ADVJAVA";

    public Connection connect()
    {
        Connection con=null;
        try
        {
            Class.forName(driver);
            con= DriverManager.getConnection(Dburl,DbUname,Dbpwd);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }

    public void blobinsert()
    {
        System.out.println("Implementing Blob Insert");
        try
        {
            Connection con=connect();
            PreparedStatement pstm=con.prepareStatement("insert into mydata1 values(?,?)");
            pstm.setString(1,"104");
            pstm.setBlob(2,new FileInputStream("D:\\NOTES\\ADVANCED_JAVA\\prac.png"));

            int rowCount=pstm.executeUpdate();
            if(rowCount==0)
            {
                throw new SQLException("Insert Failed");

            }
            else {
                System.out.println("Insert Successfully");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new insertPicToDatabase().blobinsert();
    }
}
