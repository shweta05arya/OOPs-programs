abstract class Sample{
    int a=10; //Non-abstract method
    void f(){
        System.out.println(a);
    }
    abstract void f2(); //Declared abstract method
}

class Child extends Sample{
    void show(){
        super.f();
    }
    void f2(){ //Defined abstract method
        System.out.println("done");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Child s = new Child(); //We need to create an object of the child class to access the abstract method
        s.show();
        s.f2();
    }
}