package Array;

import java.util.Scanner;

public class Sum_of_Array
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int[] a=new int[size];
        System.out.println("Enter the "+size+" array elements");
        for(int i=0;i<=a.length-1;i++)
        {
            a[i]=sc.nextInt();
        }

        int sum=0;
        for(int i=0;i<=a.length-1;i++)
        {
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}
