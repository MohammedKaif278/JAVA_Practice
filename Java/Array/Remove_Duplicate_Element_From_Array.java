package Array;

import java.util.Arrays;

public class Remove_Duplicate_Element_From_Array
{

    public static int[] removeDuplicates1(int[] arr)
    {
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if( arr[i]!='*' && arr[i]==arr[j])
                {
                    arr[j]='*';
                    c++;
                }
            }
        }
        int brr[]=new int[(arr.length)-c];
        int x=0;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]!='*')
            {
                brr[x++]=arr[i];
            }
        }
    return brr;
    }


    public static int[] removeDuplicates(int[] arr)
    {
        int l=arr.length;
        for(int i=0;i<l;i++)
        {
            for (int j=i+1;j<l;j++)
            {
                if(arr[i]==arr[j])
                {
                    for(int k=j;k<l-1;k++)
                    {
                        arr[k]=arr[k+1];
                    }
                    l--;
                    j--;
                }
            }
        }
        return Arrays.copyOfRange(arr,0,l);
    }
    public static void main(String[] args) {

        int arr[]={1,1,1,1,1,2,1,2,3,4,5,6,76,6,42};
       int n=2;
       if(n==1)
       {
           System.out.println("Before Array is : "+ Arrays.toString(arr));
           arr=removeDuplicates(arr);
           System.out.println("After Array is : "+ Arrays.toString(arr));
       }
       else if(n==2)
       {
           System.out.println("Before Array is : "+ Arrays.toString(arr));
           arr=removeDuplicates1(arr);
           System.out.println("After Array is : "+ Arrays.toString(arr));
       }
    }
}
