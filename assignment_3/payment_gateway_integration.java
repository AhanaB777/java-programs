/* 5.  Payment Gateway Integration 
An e-commerce platform wants to integrate multiple payment gateways.
- Define an interface UPIPayment with a method payViaUPI(). 
- Define another interface CardPayment with a method payViaCard(). 
- Implement a class OnlinePayment that inherits both interfaces and provides functionality to process 
both UPI and Card payments. 

Task: Implement the system and simulate payment processing for both UPI and card transactions. */
package assignment_3;

interface UPIPayment {
    void payViaUPI();
}

interface CardPayment {
    void payViaCard();
}

class OnlinePayment implements UPIPayment, CardPayment {
    public void payViaUPI() {
        System.out.println("Payment done using UPI");
    }

    public void payViaCard() {
        System.out.println("Payment done using Card");
    }
}

public class payment_gateway_integration {
    public static void main(String[] args) {
        UPIPayment p1 = new OnlinePayment();
        CardPayment p2 = new OnlinePayment();

        p1.payViaUPI();
        p2.payViaCard();
    }
}
