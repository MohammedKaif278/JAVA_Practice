package Collections.Set.Hashset;

import java.util.HashSet;

public class Add_Print_UsingForLoop {
    public static void main(String[] args) {
        HashSet<Integer> h=new HashSet<>();
        for(int i=0;i<10;i++)
        {
            h.add(i);
        }
        for(Integer num:h)
        {
            System.out.println(num);
        }
    }
}
