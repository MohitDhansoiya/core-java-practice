package array;

public class ArrayStr38 {
    public static void main(String[] args) {
        int cCount = 0, vCount = 0;
        String sentence = "This is a realy simple sentence";
        sentence = sentence.toLowerCase();
        for(int i = 0; i < sentence.length(); i++){
            if( sentence.charAt(i) == 'a'|| sentence.charAt(i) == 'e'||sentence.charAt(i)== 'i'||sentence.charAt(i)=='o'||sentence.charAt(i)=='u'){
                vCount++;
            }else if(sentence.charAt(i) >= 'a'&& sentence.charAt(i) <= 'z'){
                cCount++;
            }
        }
        System.out.println("number of vowels:"+vCount);
        System.out.println("number of consonants:"+cCount);
    }
}
