class Car {
    int price;

    Car(int price) {
        this.price = price;
    }
}

class BMW extends Car {
    BMW(int price) {
        super(price);
    }
}

class maincar {
    public static void main(String[] args) {
        BMW myBMW = new BMW(50000);
        System.out.println("The price of the BMW is: $" + myBMW.price);
    }
}
