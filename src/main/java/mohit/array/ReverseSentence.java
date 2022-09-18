package mohit.array;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "My name is mohit";
        int vCount = 0, cCount = 0;

        sentence = sentence.toLowerCase();
        for(int i = 0; i < sentence.length(); i++){
            if( sentence.charAt(i) == 'a'|| sentence.charAt(i) == 'e'||sentence.charAt(i)== 'i'||sentence.charAt(i)=='o'||sentence.charAt(i)=='u'){
                vCount++;
            }else if(sentence.charAt(i) >= 'a'&& sentence.charAt(i) <= 'z'){
                cCount++;
            }
        }
        System.out.println("vowels is:"+vCount);
        System.out.println("constant is:"+cCount);
    }
}
