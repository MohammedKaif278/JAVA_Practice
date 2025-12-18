package File_IO.File;

import java.io.File;

public class DirectoryDemo
{
    public static void main(String[] args) {
        File f=new File("kaif");
        System.out.println(f.exists());
        f.mkdir();
        System.out.println(f.exists());
    }
}
