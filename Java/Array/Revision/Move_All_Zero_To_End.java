package Array.Revision;

import java.util.Arrays;

public class Move_All_Zero_To_End {
    public static int[] moveZero(int[] arr){
        int j=0; // j=0
        for(int i=0;i<arr.length;i++){ //i=0 - 1
            if(arr[i]!=0){ // 0!=0 f - 4!=0 t -
                int temp=arr[i]; // 4
                arr[i]=arr[j]; // 1th->0 -
                arr[j]=temp; // 0th->4 -
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={0,4,0,5,0,6,0,5};
        System.out.println(Arrays.toString(moveZero(arr)));
    }
}
