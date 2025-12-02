package Array;

public class PrimeIndexElements
{
    public static void primeIndexElements(int[] a)
    {
        System.out.println("Prime Index Elements : ");
        for(int i=0;i<a.length;i++)
        {
            int c=0;
            for(int j=1;j<a.length;j++)
            {
                if(i%j==0)
                {
                    c++;
                }
            }
            if(c==2)
            {
                System.out.println(a[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] a={7,5,2,4,8,2,5,3};
        primeIndexElements(a);
    }
}
