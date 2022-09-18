package array;

public class StringAllMethod {
    public static void main(String[] args) {
        String str = new String("Once upon a time in mumbai");
        str.length();
        String array[] = str.split("\\s");
        for(String str1 : array ){
            System.out.println(str1);
        }
        System.out.println("substring starting from index 10:");
        System.out.println(str.substring(10));
        System.out.println("subString starting from 10 ending with 16:");
        System.out.println(str.substring(10,16));
        System.out.println("String after replace all 'o' to 'n':");
        System.out.println(str.replace('o','n'));
        System.out.println("Length of string:" + str.length());
        System.out.println("convert the lowerCase:"+str.toLowerCase());
        System.out.println("convert the upperCase:"+str.toUpperCase());
        str = str.replaceAll("\\s","");
        System.out.println("Stirng after removing all white space:"+str);
        String reversedStr  = "";
        for (int i = str.length() - 1 ; i >=0; i--) {
            reversedStr = reversedStr + str.charAt(i);
        }
        System.out.println("string after reverse:"+ reversedStr);
    }
}
