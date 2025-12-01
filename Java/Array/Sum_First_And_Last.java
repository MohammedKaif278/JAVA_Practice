package Array;

public class Sum_First_And_Last
{
    public static void sumFirstAndLast(int[] a)
    {
        int sum=a[0]+a[a.length-1];
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int[] a={4,5,6,7,8};
        sumFirstAndLast(a);
    }
}
