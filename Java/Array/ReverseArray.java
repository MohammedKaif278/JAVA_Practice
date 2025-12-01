package Array;

import java.util.Arrays;

public class ReverseArray
{
    public static int[] reverserray(int[] a)
    {
        int start=0; int end=a.length-1;
        while(start<end)
        {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;

            start++;
            end--;
        }
        return a;
    }
    public static void main(String[] args) {
        int[] a={4,5,6,7,8,9};
        reverserray(a);
        System.out.println(Arrays.toString(a));

    }
}
