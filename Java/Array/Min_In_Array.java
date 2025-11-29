package Array;

public class Min_In_Array
{
    public static int minElement(int[] a)
    {
        int min=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        return min;

    }
    public static void main(String[] args) {
        int[] a={4,8,9,5,6,11};
        System.out.println("Min element in Array is "+minElement(a));
    }
}
