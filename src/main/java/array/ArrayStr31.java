package array;

public class ArrayStr31 {
    public static void main(String[] args) {
        String sentence = "This is the india";
        String[] words = sentence.split(" ");
        for(int i = words.length - 1; i>=0 ; i--){
            System.out.println(words[i]);

        }
    }

}
