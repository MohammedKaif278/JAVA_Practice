package String;

public class Count_The_words {

    public static void main(String[] args) {
//        String str=" Welcome to naresh it ".trim();
//        int c=1;
//        for (int i=0;i<str.length();i++) {
//            if(str.charAt(i)==' ') {
//                c++;
//            }
//        }
//        System.out.println(c);

        String str=" Welcome to naresh it ";
        int c=0;
        for(int i=0;i<str.length();i++)
        {
            if( str.charAt(i)!=' ' && (i==0  || str.charAt(i-1)==' '))
            {
                c++;
            }
        }
        System.out.println(c);

    }
}
