package Array;

import java.util.Arrays;
import java.util.Scanner;



public class Insert_Element_Last_Index
{
    public static int [] insertAtLast(int[] a,int n)
    {
        int[] b=new int[a.length+1];
        for(int i=0;i<a.length-1;i++)
        {
            b[i]=a[i];
        }
        b[b.length-1]=n;
        return b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array size");
        int size=sc.nextInt();
        int[] a=new int[size];
        System.out.println("Enter The "+size+" elements  of array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Enter the new Element");
        int newElement=sc.nextInt();
        int[] b=insertAtLast(a,newElement);
        System.out.println(Arrays.toString(b));
    }
}
