package Array.Revision;

public class Largest_Element_In_Array {
    public static void main(String[] args) {
        int[] a={7,8,5,4,9};
        int max=a[0]; // Declare 1st element as max

        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Largest Element In Array is : "+max);
    }
}
