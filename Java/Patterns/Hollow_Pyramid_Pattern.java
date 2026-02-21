package Patterns;

public class Hollow_Pyramid_Pattern
{
    public static void main(String[] args) {
        int space=4;
        int star=1;
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int a=1;a<=space;a++)
            {
                System.out.print("   ");
            }

            for(int b=1;b<=i*2-1;b++)
            {
                if(i==n || b==1 || b==i*2-1 )
                {
                System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            star+=2;
            space--;
            System.out.println();
        }
    }
}
