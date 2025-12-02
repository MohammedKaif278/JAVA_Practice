package Array;

import java.util.Arrays;

public class MergeTwoArray
{
    public static int[] mergeArray(int[] a,int[] b)
    {
        int[] c=new int[a.length+b.length];
        for(int i=0;i<c.length;i++)
        {
            if(i<a.length)
            {
                c[i]=a[i];
            }
            else {
                c[i]=b[i-a.length];
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={6,7,8,9,10};
        int[] c=mergeArray(a,b);
        System.out.println(Arrays.toString(c));
    }
}
