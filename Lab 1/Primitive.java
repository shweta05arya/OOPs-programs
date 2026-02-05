class PrimitiveDemo {
    public static void main(String[] args) {

        
        int a = 10;
        float b = 5.5f;
        double c = 20.25;
        char ch = 'A';
        boolean flag = true;

        
        int sum = a + 5;
        int product = a * 2;

        boolean result = a > 5;

        boolean logicalResult = (a > 5) && flag;

        System.out.println("int value: " + a);
        System.out.println("float value: " + b);
        System.out.println("double value: " + c);
        System.out.println("char value: " + ch);
        System.out.println("boolean value: " + flag);

        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
        System.out.println("a > 5 = " + result);
        System.out.println("(a > 5) AND flag = " + logicalResult);
    }
}
