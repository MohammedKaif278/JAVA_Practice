package Array.Revision;

import java.util.Arrays;

public class Left_Rotate_The_Array_By_One_Place {

     public static int[] leftRotate(int[] arr) {
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
         return arr;
     }

    public static void main(String[] args) {
        int[] arr={7,5,8,9,4,7};
        System.out.println(Arrays.toString(leftRotate(arr)));
    }
}
