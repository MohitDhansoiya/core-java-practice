package array;

public class ArrayStr40 {
    public static void main(String[] args) {
        String words = "aaaabbbbcccc";
        int len = words.length();
        int n = 3;
        int temp = 0, chars = len/n;
        String [] equalStr = new String[n];
        if(len % n != 0 ){
            System.out.println("Sorry This String cannot be divided into"+ n +"equals");
        } else{
            for(int i = 0; i < len; i++){
                String part = words.substring(i,i+chars);
                equalStr[temp] = part;
                temp++;
            }
            System.out.println(n+"Equals parts of given Array");
            for(int i = 0; i < equalStr.length; i++){
                System.out.println(equalStr[i]);
            }
        }
    }
}
