package Abstraction;

public abstract class Product {
    abstract void draw();
    }
    class Oil extends Product{
        @Override
        void draw() {
            System.out.println("dabur");
        }
    }
    class Sampoo extends Product{
        void draw(){
            System.out.println("holla");
        }
    }
    class TestProduct{
        public static void main(String[] args) {
            Product p = new Sampoo();
            p.draw();
        }
    }