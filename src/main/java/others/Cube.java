package others;

import java.util.Scanner;

public class Cube {
    int length ;
    int width ;
    int height;
    void upadteValue(int l,int w,int h){
        length = l;
        width = w;
        height = h;
    }
    void VolumeOfCube(){
        System.out.println(length*width*height);
    }
}
class TestCube{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Volume Of Cube");
        int length = scan.nextInt();
        System.out.println("volume of length");
        int width = scan.nextInt();
        System.out.println("volume of width");
        int height = scan.nextInt();
        System.out.println("volume of height");
        scan.close();
        Cube cb = new Cube();
        cb.upadteValue(  length,width, height);
        cb.VolumeOfCube();
    }
}
