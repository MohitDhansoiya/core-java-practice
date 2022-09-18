package Interface;
interface Printable01{
    void print();
}
interface Showable01{
    void show();
}
 class Paper12 implements Printable01,Showable01{

     @Override
     public void print() {
         System.out.println("Hello");
     }

     @Override
     public void show() {
         System.out.println("welcome");
     }

     public static void main(String[] args) {
         Paper12 ob = new Paper12();
         ob.print();
         ob.show();
     }
 }
