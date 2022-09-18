package Interface;

 interface Sweets {
     void shop();
}
class Worker implements Sweets{

    @Override
    public void shop() {
        System.out.println("all sweets are available");
    }

    public static void main(String[] args) {
        Worker ob = new Worker();
        ob.shop();
    }
}
