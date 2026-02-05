class Subject {
    int sum(int a, int b) {
        return a + b;
    }
}
class BMW extends Subject {
    @Override                   //To indicate that we are overriding the method from the parent class
    int sum(int a, int b) {     // same function with same parameters
        return a - b;           // method overriding
    }
    int display() {
        int v = super.sum(4, 5); // to call the method from the parent class
        return v;
    }
}

public class Polymorphism3 {
    public static void main(String[] args) {
        Subject d = new Subject();
        BMW e = new BMW();
        System.out.println(d.sum(2, 3));
        System.out.println(e.sum(3, 3));
    
    }
}

