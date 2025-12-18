package File_IO.File;

import java.io.File;

public class Display_Files_In_xyzDirectory
{
    public static void main(String[] args) {
        int c=0;
        File f=new File("D:\\NOTES");
        String[] s=f.list();
        for(String s1:s)
        {
            File f1=new File(f,s1);
            if(f1.isFile())
            {
                c++;
                System.out.println(f1);
            }

        }
        System.out.println("The total number of files in the directory is: "+c);
    }
}
