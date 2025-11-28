package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Insert_Element_First_Index {
    public static int[] insetFirst(int[] a,int n)
    {
        int[] b=new int[a.length+1];
        for(int i=0;i<a.length;i++)
        {
            b[i+1]=a[i];

        }
        b[0]=n;
        return b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int size=sc.nextInt();
        int[] a=new int[size];
        System.out.println("Enter the "+ size+" Array Elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the new Element");
        int newElement=sc.nextInt();
        int[] b=insetFirst(a,newElement);
        System.out.println(Arrays.toString(b));
    }
}
