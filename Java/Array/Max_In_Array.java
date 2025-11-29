package Array;

import java.util.Scanner;

public class Max_In_Array
{
    public static int maxElement(int[] a)
    {
        int max=a[0];

        for(int i=0;i<a.length;i++) {
            if(a[i]>max) {
                max=a[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={11,7,8,9,10};
        System.out.println("Max Element in Array is "+maxElement(a));
    }
}
