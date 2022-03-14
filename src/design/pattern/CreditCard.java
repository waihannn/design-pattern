package design.pattern;

public class CreditCard implements Payment {
    @Override
    public void MakePayment() {
        System.out.println("The selected payment is Credit Card");
        System.out.println("Payment Succesful");
    }
}
