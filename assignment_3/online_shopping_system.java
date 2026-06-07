/* 2. Online Shopping System 
Problem Statement: 
Develop an Online Shopping System with: 
- Product (Base class) containing productName and price. 
- Electronics (Intermediate class) inheriting Product and adding warrantyPeriod. 
- Smartphone (Derived class) inheriting Electronics and adding batteryLife. 
Tasks:
1. Implement multilevel inheritance. 
2. Create a method to display product details. 
3. Demonstrate object instantiation and display the product hierarchy. 
Expected Output Example: 
Product Name: iPhone 14 
Price: $999 
Warranty: 1 year 
Battery Life: 20 hours */

package assignment_3;

class Product {
    String productName;
    int price;

    Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    void display() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }
}

class Electronics extends Product {
    int warrantyPeriod;

    Electronics(String productName, int price, int warrantyPeriod) {
        super(productName, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    void display() {
        super.display();
        System.out.println("Warranty: " + warrantyPeriod + " year");
    }

}

class Smartphone extends Electronics {
    int batteryLife;

    Smartphone(String productName, int price, int warrantyPeriod, int batteryLife) {
        super(productName, price, warrantyPeriod);
        this.batteryLife = batteryLife;
    }

    void display() {
        super.display();
        System.out.println("Battery Life: " + batteryLife + " hours");
    }
}

public class online_shopping_system {
    public static void main(String[] args) {
        Smartphone s = new Smartphone("iphone 14", 999, 1, 20);
        s.display();
    }
}
