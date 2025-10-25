package Jdbc.StreamsWithJdbc.Clob;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.Reader;
import java.sql.*;

public class retriveFileFromDatabase
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

    public void clobRetrive()
    {
        System.out.println("Retriving File From database");
        try
        {
            Connection con=connect();
            PreparedStatement pstm=con.prepareStatement("select file_data from mydata2 where id=?");
            pstm.setString(1,"104");

            ResultSet rs= pstm.executeQuery();
            if(rs.next())
            {
                Clob b=rs.getClob(1);
                Reader data=b.getCharacterStream();
                BufferedReader br=new BufferedReader(data);
                FileWriter fw=new FileWriter("D:\\NOTES\\ADVANCED_JAVA\\prac2.txt");
                String line;
                while((line=br.readLine())!=null)
                {
                    fw.write(line);


                }
                br.close();
                fw.close();


            }
            else
            {
                throw new RuntimeException("Retriving failed due to fatal error");
            }


        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new retriveFileFromDatabase().clobRetrive();
    }
}
