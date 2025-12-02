package Array;

import java.util.Scanner;

public class SearchElementInArray
{
    public static void searchElement(int[] a,int target)
    {
        boolean found=false;
        for(int i=0;i<a.length;i++) {
            if(a[i]==target) {
                System.out.println(target+" Found at index "+i);
                found=true;
            }
        }
        if(!found) {
        System.out.println(target+" Not found");
        }
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int[] a={4,5,7,8,9,5,6,5};
        System.out.println("Enter the element you want to search");
        int target=sc.nextInt();
        searchElement(a,target);
    }
}
