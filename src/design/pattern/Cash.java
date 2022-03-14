package design.pattern;

public class Cash implements Payment {
    
    @Override
    public void MakePayment() {
        System.out.println("The selected payment is Cash");
        System.out.println("Payment Succesful");
    }
}
