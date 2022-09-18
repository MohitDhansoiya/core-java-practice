package array;

public class ArrayStrRepative44 {
    public static String icp(String s,String t){
        int n = Math.min(s.length(),t.length());
        for(int i = 0; i < n ; i ++){
            if(s.charAt(i) != t.charAt(i)){
               return s.substring(0,i);
            }
        }
        return s.substring(0,n);
    }

    public static void main(String[] args) {
        String str = "aksbgfmnhbgf";
        String lsr = "";
        int n = str.length();
        for(int i = 0; i < n; i ++){
            for(int j = 0 ; j < n ; j++){
                String x = icp(str.substring(i,n),str.substring(j,n));
                if(x.length() > lsr.length())lsr = x;
            }
        }
        System.out.println("Logest Reapting Sequence"+lsr);
    }
}
