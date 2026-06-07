/*
3. Online Payment System 
Problem Statement: 
An online shopping platform supports different payment methods like Credit Card and PayPal. Each 
payment method should: 
 Have a transaction ID, amount, and a method to process the payment. 
 Implement different payment processing mechanisms:  
o Credit Card: Charge 2% transaction fee. 
o PayPal: Charge 3% transaction fee. 
Design an abstract class Payment and implement its subclasses (CreditCardPayment, PayPalPayment). 
Write a Java program to process payments. 
*/

package assignment_3;

abstract class Payment {
    String transactionID;
    double amount;

    Payment(String transactionID, double amount) {
        this.transactionID = transactionID;
        this.amount = amount;
    }

    void display() {
        System.out.println("Transaction ID: " + transactionID);
        System.out.println("Amount: " + amount);
    }

    abstract double processPayment();
}

class CreditCardPayment extends Payment {
    double transactionFee = 0.02;

    CreditCardPayment(String transactionID, double amount) {
        super(transactionID, amount);
    }

    double processPayment() {
        return amount + transactionFee * amount;
    }

    void display() {
        super.display();
        System.out.println("Transaction fee: " + transactionFee);
        System.out.println("Fee Amount: " + amount * transactionFee);
    }
}

class PayPalPayment extends Payment {
    double transactionFee = 0.03;

    PayPalPayment(String transactionID, double amount) {
        super(transactionID, amount);
    }

    double processPayment() {
        return amount + transactionFee * amount;
    }

    void display() {
        super.display();
        System.out.println("Transaction fee: " + transactionFee);
        System.out.println("Fee Amount: " + amount * transactionFee);
    }

}

public class online_payment_system {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment("ABC123", 400);
        p1.display();
        System.out.println("Processed Amount for Credit Card: " + p1.processPayment());

        System.out.println();

        Payment p2 = new PayPalPayment("DEF456", 400);
        p2.display();
        System.out.println("Processed Amount for PayPal: " + p2.processPayment());
    }
}
