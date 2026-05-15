package Array.Revision;

public class Array_Is_Sorted_Or_Not {

    public static boolean isSortedOrNot(int[] arr){
        for(int i=1;i<arr.length;i++){ // i=1 - 2
            if(arr[i]>=arr[i-1]){// 2>=1 - 4>=2

            }
            else {
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={1,2,4};
        System.out.println(isSortedOrNot(arr));
    }
}
