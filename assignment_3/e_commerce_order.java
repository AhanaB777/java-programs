/*8. E-Commerce Order Processing 
An E-Commerce System processes customer orders. 
- Define a custom exception OutOfStockException that is thrown when a product is out of stock. 
- Create a class Product with:  
o Attributes for name, stock, and a method purchase(int quantity) that checks availability and 
throws an exception if the stock is insufficient. 
- Implement exception handling in a main method. 
Task: Simulate an order placement where a user tries to buy a product that is out of stock.  */

package assignment_3;

class OutOfStockException extends Exception {
    OutOfStockException(String m) {
        super(m);
    }
}

class Product {
    String Pname;
    int stock;

    Product(String Pname, int stock) {
        this.Pname = Pname;
        this.stock = stock;
    }

    void purchase(int quantity) throws OutOfStockException {
        if (stock < quantity) {
            throw new OutOfStockException("Quantity left in Stock: " + stock);
        }
        stock -= quantity;
        System.out.println("Purchased " + quantity + " quantity.");

    }

}

public class e_commerce_order {
    public static void main(String[] args) {
        Product p1 = new Product("Book", 90);
        try {
            p1.purchase(60);
            p1.purchase(20);
            p1.purchase(40);
        } catch (OutOfStockException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
