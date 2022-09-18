package array;

import java.util.Scanner;

public class ArrayStr18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how many friends name Enter :");
        int name = scan.nextInt();
        scan.nextLine();
        String arrayString[] = new String[name];
        for (int i = 0; i < arrayString.length - 1; i++) {
            System.out.print(arrayString[i]);
        }
    }
}
