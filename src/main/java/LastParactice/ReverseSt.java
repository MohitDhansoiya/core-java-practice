package LastParactice;

public class ReverseSt {
    public static void main(String[] args) {
        String sentence = "This is the india";
        String newSentence = "";
        String reverseWord = "";
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length;  i++) {
//            System.out.print(words[i] +" ");
                    String rever =  words[i];
                    for(int j = rever.length() - 1; j >= 0; j--){
                        reverseWord = reverseWord + rever.charAt(j);

                    }
        }
        newSentence = newSentence + reverseWord ;
        System.out.println(newSentence+ " ");

    }
}
