package Jdbc.BatchProcessing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Scanner;

public class BasicBatchProcessing
{
    String driver="oracle.jdbc.OracleDriver";
    String Dburl="jdbc:oracle:thin:@localhost:1521:orcl";
    String DbUname="ADVJAVA";
    String Dbpwd="ADVJAVA";

    Scanner sc=new Scanner(System.in);

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


    public void batchProcessing()
    {
        System.out.println("Implementing BatchProcessing");
        try
        {
            Connection con=connect();
            Statement stmt=con.createStatement();

            System.out.println("How Many Sql Query you Want to add in Batch");
            int num=Integer.parseInt(sc.nextLine());

            for(int i=1;i<=num;i++)
            {
                System.out.println("Enter "+i+"Query");
                String sqlQuery=sc.nextLine();
                stmt.addBatch(sqlQuery);
            }

            int[] arr=stmt.executeBatch();
            System.out.println(Arrays.toString(arr));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new BasicBatchProcessing().batchProcessing();
    }
}
