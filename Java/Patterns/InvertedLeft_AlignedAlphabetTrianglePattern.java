package Patterns;
/*
A B C D E
F G H I
J K L
M N
O

 */
public class InvertedLeft_AlignedAlphabetTrianglePattern {
    public static void main(String[] args) {
        char x='A';
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=1;j--)
            {
                if(i<=j)
                {
                System.out.print(" "+x+" ");
                x++;
                }
            }
            System.out.println();
        }
    }
}
