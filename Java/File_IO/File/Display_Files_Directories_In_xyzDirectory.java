package File_IO.File;

import java.io.File;

public class Display_Files_Directories_In_xyzDirectory
{
    public static void main(String[] args) {
        int c=0;
        File f=new File("D:\\NOTES");
       String[] s=f.list();
       for(String s1:s)
       {
           c++;
           System.out.println(s1);
       }
        System.out.println("The total number of files and Directories in the directory is: "+c);
    }
}
