class class_and_object {
    public static void main (String a[]){
        calculator cal = new calculator();
        System.out.println(cal.sum(5,6));

        Car myCar = new Car("Toyota", "Camry", 2022);

        // Accessing fields
        System.out.println("Brand: " +  myCar.brand + "model: " + myCar.model + "Year: " + myCar.year);

    }
}

class calculator {
    public int sum(int num1,int num2){
        int r = num1 + num2;
        return r;
    }
}

class Car {
    // Fields (properties)
    String brand;
    String model;
    int year;

    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method
    public void start() {
        System.out.println("The car is starting...");
    }
}
