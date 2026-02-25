package Array;

public class Second_Largest_In_Array
{
    public static void main(String[] args) {
        int[] arr={7,8,9,5,6,4};
        int max=arr[0];
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                secondLargest=max;
                max=arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]<max)
            {
                secondLargest=arr[i];
            }
        }
        System.out.println("Second Largest Number is : "+secondLargest);
    }
}
