package array;

public class ArrayReplceSpace {
    public static void main(String[] args) {
        String string = "Once upon a time in mumbai";
        char ch = '-';
        string = string.replace(' ', ch);
        System.out.println("Replaceing Spcae With given Character:" + string);
    }
}
