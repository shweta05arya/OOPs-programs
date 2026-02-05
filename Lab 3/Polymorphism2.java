class Subject {
    int sum(int a, int b) {
        return a + b;
    }
    int sum(int c, int d, int e) { // same fuction with different parameters
        return c + d + e; // method overloading
    } 
}

public class Polymorphism2 {
    public static void main(String[] args) {
        Subject d = new Subject();
        System.out.println(d.sum(2, 3));
        System.out.println(d.sum(2, 3, 4));
    
    }
}
