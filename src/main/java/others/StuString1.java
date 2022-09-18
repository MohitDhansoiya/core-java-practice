package others;

public class StuString1 {
    public static void main(String[]args){
        String name = "Mohit";
//        char ch[] = {'m','o','h','i','t'};
//        String st = new String(ch);
//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());
//
//        System.out.println(name.length());
//        System.out.println(name.isEmpty());
//        System.out.println(name.trim());
//       System.out.println(name.indexOf('e'));
//        System.out.println(name.lastIndexOf('e'));
//        System.out.println(name.charAt(3));
//        System.out.println(name.contains("ep"));
//        System.out.println(name.startsWith("it"));
//        System.out.println(name.endsWith("hi"));
        String rev = "";
        for(int i = name.length()-1; i >= 0; i--){
            rev = rev + name.charAt('i');
        }
        System.out.println(rev);
    }
}
