package design.pattern;

public class Ticket {
    private static Ticket instance = new Ticket();

    public static Ticket getTicket() {
        return instance;
    }

    public void ShowMessage(int price) {
        System.out.println("Ticket price is " + price);
        System.out.println("Generating Ticket. Please wait a moment");
        System.out.println("Ticket is ready");
    }

    public void SelectedMovie(String movie) {
        int price = 0;
        if (movie == "Naruto") {
            price = 20;
        } else if (movie == "Kingsmen") {
            price = 20;
        } else if (movie == "Avatar") {
            price = 25;
        }
        System.out.println("The movie selected is " + movie);
        ShowMessage(price);
    }

    public Payment getPayment(String payment) {
        if(payment == null) {
            return null;
        }

        if(payment.equalsIgnoreCase("Cash")) {
            return new Cash();
        } else if (payment.equalsIgnoreCase("Credit Card")) {
            return new CreditCard();
        }
        else if(payment.equalsIgnoreCase("EWallet")) {
            return new EWallet();
        }
        return null;
    }
}