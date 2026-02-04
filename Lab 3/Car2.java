class Car2 {
    Car2() {
        System.out.println("Car2 constructor called");
    }
}
class BMW2 extends Car2 {
    BMW2(){
        super();
        super(); 
        System.out.println("BMW2 constructor called");
    }
}
class test {
    public static void main(String args[]) {
        BMW2 b = new BMW2();
    }
}