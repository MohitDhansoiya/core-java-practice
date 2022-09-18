package LastParactice;

public class StringVowles {
    public static void main(String[] args) {
        String sen = "Once Upon timme in mumbai";
        int vCount = 0, cCount = 0;
        sen = sen.toLowerCase();
        String[] words = sen.split(" ");
        for (int i = 0; i <= sen.length() - 1; i++) {
//            System.out.println(sen.charAt(i));
            if (sen.charAt(i) == 'a' || sen.charAt(i) == 'e' || sen.charAt(i) == 'i' || sen.charAt(i) == 'o' || sen.charAt(i) == 'u') {
                vCount++;
            } else if(sen.charAt(i)>=  'a' && sen.charAt(i) <= 'z' ){
                cCount++;
            }
        }
        System.out.println("total vowels:"+ cCount);
        System.out.println("Constant value:"+vCount);
    }

}
