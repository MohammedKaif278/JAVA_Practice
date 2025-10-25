package Jdbc.StreamsWithJdbc.Blob;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.*;


public class RetrivePicFromDatabase
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
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }

    public  void blobRetrive()
    {
        System.out.println("Retriving Data");
        try
        {
            Connection con=connect();
            PreparedStatement pstm=con.prepareStatement("select pic_data from mydata1 where id=?");
            pstm.setString(1,"104");
            ResultSet rs=pstm.executeQuery();

            if(rs.next())
            {
                Blob b=rs.getBlob(1);
                byte[] arr=b.getBytes(1,(int) b.length());

                FileOutputStream fos=new FileOutputStream("D:\\NOTES\\ADVANCED_JAVA\\pracIntel.png");
                fos.write(arr);
                fos.close();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new RetrivePicFromDatabase().blobRetrive();
    }



}
