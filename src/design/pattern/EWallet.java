package design.pattern;

public class EWallet implements Payment {
    @Override
    public void MakePayment() {
        System.out.println("The selected payment is E-Wallet");
        System.out.println("Payment Succesful");
    }
}
