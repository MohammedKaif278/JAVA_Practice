package Array;

import java.util.Arrays;

public class ReverseArray
{
    public static void reverserray(int[] a)
    {
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.println(a[i]+" ");

        }
    }
    public static void main(String[] args) {
        int[] a={4,5,6,7,8,9};
        reverserray(a);
    }
}
