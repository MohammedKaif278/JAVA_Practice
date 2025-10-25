package Jdbc.StreamsWithJdbc.Clob;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertFileToDatabase {
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

    public void clobInsert()
    {
        System.out.println("Inserting file to Database");
        try
        {
            Connection con=connect();
            PreparedStatement pstm=con.prepareStatement("insert into mydata2 values(?,?)");
            pstm.setString(1,"104");
            pstm.setClob(2,new FileReader("D:\\NOTES\\ADVANCED_JAVA\\file3.txt"));

            int rowCount=pstm.executeUpdate();
            if(rowCount==0)
            {
                throw new SQLException("Check Code");
            }
            else {
                System.out.println("File Inserted");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new insertFileToDatabase().clobInsert();
    }
}
