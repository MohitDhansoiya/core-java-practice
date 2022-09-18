package LastParactice;

public class Vowels {
    public static void main(String[] args) {
        String sentence = "Once upon a time in mumbai";
        int vCount = 0, cCount = 0;
        sentence = sentence + sentence.toLowerCase();
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u') {
                vCount++;
            } else if
            (sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'z') {
                cCount++;
            }
        }
        System.out.println("No Of Vowels:" + vCount);
        System.out.println("No of Constant:" + cCount);
    }
}



