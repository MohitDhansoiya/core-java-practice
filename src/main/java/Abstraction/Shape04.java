package Abstraction;

public abstract class Shape04 {
    abstract void show();
    int width = 10;
    int length = 23;
    int result = width * length;
    void area(){
        System.out.println(result);
    }
    }
    class Rectangle03 extends Shape04{
        int width = 10;
        int length = 31;
        int area = width * length;
        void show() {
            System.out.println(area);
        }
    }
    class Circle01 extends Shape04{
        float pi = 3.14f;
        int radius = 23;
        float areaOfCircle = 2 * pi * radius;
        @Override
        void show() {
            System.out.println(areaOfCircle);
        }
    }
    class TestAhape04{
        public static void main(String[] args) {
            Shape04 ob ;
            ob = new Rectangle03();
            ob.show();
            ob = new Circle01();
            ob.show();
        }
    }
