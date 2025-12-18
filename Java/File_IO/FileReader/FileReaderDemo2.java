package File_IO.FileReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2
{
    public static void main(String[] args) throws IOException {
        File f=new File("D:\\abc.txt");
        FileReader fr=new FileReader(f);
        char[] ch=new char[(int) f.length()];
        fr.read(ch);
        for(int ch1:ch)
        {
            System.out.print((char) ch1);
        }
    }
}
