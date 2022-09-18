package Starting;

public class IfElseIf {
    public static void main(String[]args){
        String name = "MohitDhansoiya";
        String reverse = "";
        for(int i = name.length()-1; i>0;i--){
            char ch = name.charAt(i);
            reverse = ch + name;
        }
        System.out.println("Reverse Name:"+reverse);
    }
    }

