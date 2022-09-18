package rectangle;

public class Rectangle {
    int lenght ;
    int breadth;
    void insert(int l , int b) {
        lenght = l;
            breadth = b;
    }
    void claculationOfArea(){
        System.out.println(lenght * breadth);
    }
}
class TestRec{
    public static void main(String[]args){
        Rectangle rt1 = new Rectangle();
        Rectangle rt2 = new Rectangle();
        rt1.insert(12,8);
        rt2.insert(6,9);
        rt1.claculationOfArea();
        rt2.claculationOfArea();
    }
}
