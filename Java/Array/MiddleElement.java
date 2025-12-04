package Array;

public class MiddleElement
{
    public static void middleElement(int[] a)
    {
        System.out.println("Output is : ");
        int mid=a.length/2;
        if(a.length%2==0) {
            System.out.println(a[mid-1]+" "+a[mid]);
        }
        else {
            System.out.println(a[mid]);
        }
    }
    public static void main(String[] args) {
        int[] a={4,5,8,9,7,6,8};
        middleElement(a);
    }
}
