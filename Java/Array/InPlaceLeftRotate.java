package Array;

import java.util.Arrays;

public class InPlaceLeftRotate
{
    public static void main(String[] args) {
        int[] a={4,5,6,7,8};
        int temp=a[0];
        for(int i=0;i<a.length-1;i++)
        {
            a[i]=a[i+1];
        }
        a[a.length-1]=temp;
        System.out.println(Arrays.toString(a));
    }
}
