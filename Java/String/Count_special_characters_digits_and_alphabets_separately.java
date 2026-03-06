package String;

public class Count_special_characters_digits_and_alphabets_separately
{
    public static void main(String[] args) {
        String str="Java@123!";

        int alphabets=0;
        int digits=0;
        int specialCharacters=0;

        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z' || ch>='A'&&ch<='Z') {
                alphabets++;
            }
            else if(ch>='0'&&ch<='9') {
                digits++;
            }
            else{
                specialCharacters++;
            }
        }

        System.out.println("Alphabets: "+alphabets);
        System.out.println("Digits: "+digits);
        System.out.println("SpecialCharacters: "+specialCharacters);
    }
}
