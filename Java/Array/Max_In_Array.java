package Array;

import java.util.Scanner;

public class Max_In_Array
{
    public static int maxElement(int[] a)
    {
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max) {
                max = a[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array Size");
        int size=sc.nextInt();
        int[] a=new int[size];
        System.out.println("Enter the "+size+" Array Elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("The max Element in arrray is "+maxElement(a));
    }
}
