package Array.Revision;

public class Remove_Duplicate_From_Sorted_Array {
    public static void main(String[] args) {
        int arr[]={1,1,1,1,1,2,1,2,3,4,5,6,76,6,42};

        for(int i=0;i<arr.length;i++)
        {
            int v=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j] && j<i){
                    v++;
                }
            }
            if(v==0){
                System.out.println(arr[i]+" ");
            }
        }
    }
}
