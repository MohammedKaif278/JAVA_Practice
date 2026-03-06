package String;

public class largest_word_and_smallest_word_sentence
{
    public static void main(String[] args) {
        String str="Java is very powerful language";
        String[] words=str.split(" ");

        String smallest=words[0];
        String largest=words[0];

        for(String word:words) {
            if(word.length()<smallest.length()) {
                smallest=word;
            }
            if(word.length()>largest.length()) {
                largest=word;
            }
        }
        System.out.println("Smallest word is : "+smallest);
        System.out.println("Largest word is : "+largest);
    }
}
