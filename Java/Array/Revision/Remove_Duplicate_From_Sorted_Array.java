package Array.Revision;

public class Remove_Duplicate_From_Sorted_Array {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4,4,5}; // i= 1 ,

        int j=0; // j= 1 -
        for(int i=1;i<arr.length;i++){ //i=1 - 2
            if(arr[i]!=arr[j]){ // 1!=1 f - 2!=1 t
                j++; //
                arr[j]=arr[i];
            }
        }

        for(int i=0;i<=j;i++){
            System.out.println(arr[i]+" ");
        }

        System.out.println("Length : "+(j+1));

    }
}
