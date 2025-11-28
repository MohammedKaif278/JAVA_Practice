package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Insert_Element_Given_Index
{
    public static int[] insertAtGivenInndex(int[] a,int n,int index)
    {
        int[] b=new int[a.length+1];
        for(int i=0;i<a.length;i++)
        {
            if(i<index)
            {
                b[i]=a[i];

            }
            else if(i==index)
            {
                b[i]=n;
            }
            else {
                b[i]=a[i-1];
            }
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size");
        int size=sc.nextInt();
        int[] a=new int[size];
        System.out.println("Enter the "+size+" Array Elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Enter the Element");
        int newElement=sc.nextInt();

        System.out.println("Enter the Index");
        int index=sc.nextInt();

        int[] b=insertAtGivenInndex(a,newElement,index);
        System.out.println(Arrays.toString(b));
    }
}
