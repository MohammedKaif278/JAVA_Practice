package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Read_Print_Array
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Array Size");
        int size=sc.nextInt();
        int[] a=new int[size];
        System.out.println("Enter the "+size+" array elements");
        for(int i=0;i<= a.length-1;i++)
        {
            a[i]=sc.nextInt();
        }

        for(int i=0;i<=a.length-1;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println(Arrays.toString(a));
    }
}
