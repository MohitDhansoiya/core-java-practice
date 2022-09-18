package LastParactice;

public class FindVowels {
    public static void main(String[] args) {
        String sen = "once upon a time in mumbai";
        int vCount = 0;
        int cCount = 0;
        sen.toLowerCase();
        for (int i = 0; i < sen.length(); i++) {

            if (sen.charAt(i) == 'a' || sen.charAt(i) == 'e' || sen.charAt(i) == 'i' || sen.charAt(i) == 'o' || sen.charAt(i) == 'u') {
                vCount++;
            } else if (sen.charAt(i) > 'a' && sen.charAt(i) < 'z') {
                cCount++;
            }
        }
        System.out.print("vowels is:" + vCount);
        System.out.print("constant is:" + cCount);
    }
}
