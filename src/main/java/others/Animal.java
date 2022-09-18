package others;

public class Animal {
    public void animalSound() {
        System.out.println("Animal sound is lisen");
        }
    }
    class Pig extends Animal{
        public void animalSound(){
        System.out.println("pig sound is wee");
        }
    }
    class Dog extends Animal{
        public void animalSound(){
        System.out.println("Dog sound is bark");
    }
}
 class Jungle{
    public static void main(String[]args){
        Animal obj1 = new Animal();
        Animal obj2Pig = new Pig();
        Animal obj3Dog = new Dog();
        obj1.animalSound();
        obj2Pig.animalSound();
        obj3Dog.animalSound();
    }
}
