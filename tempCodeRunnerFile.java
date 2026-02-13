Class A {
    Static int a = 10;
}
Class B extends A {
    Static int a = 20;
}
Class Main {
    Public static void main(String[] args) {
        A a = new A();
        B b = new B();
        System.out.println(B.a);
    }
}