package Array;

import java.util.Arrays;

public class InPlaceLeftRotate
{
    public static void main(String[] args) {
        int[] a={4,5,6,7,8};
        int[] b=new int[a.length];
        b[a.length-1]=a[0];
        for(int i=0;i<a.length-1;i++)
        {
            b[i]=a[i+1];
        }
        System.out.println(Arrays.toString(b));
    }
}
