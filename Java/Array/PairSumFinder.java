package Array;

import java.util.Scanner;

public class PairSumFinder
{
    public static void pairSum(int[] a,int target)
    {
        boolean found=false;

        for(int i=0;i<a.length;i++) {
            for(int j=i+1;j<a.length;j++) {
                if(a[i] + a[j]==target) {
                    System.out.println(a[i]+" + "+a[j]+" = "+target);
                    found=true;
                }
            }
        }
        if(!found) {
            System.out.println("No Pairs Found with the sum "+target);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a={2,7,4,-5,11,5,20};
        System.out.println("Enter the target Number");
        int target=sc.nextInt();
        pairSum(a,target);
    }
}
