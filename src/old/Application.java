package old;

public class Application {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        ticket.BuyTicket("Naruto", "Credit Card");
    }
}

class Ticket {
    public void BuyTicket(String movie, String payment) {
        if (movie == "Naruto") {
            System.out.println("The ticket price is rm20");
            if (payment == "Credit Card") {
                System.out.println("Credit Card payment is succesful maded. Your ticket is purchased.");
            } else if (payment == "E-wallet") {
                System.out.println("E-Wallet payment is succesful maded. Your ticket is purchased");
            } else {
                System.out.println("Cash Payment is succesful maded. Your ticket is purchased.");
            }
        } else if (movie == "Kingsmen") {
            System.out.println("The ticket price is rm15");
            if (payment == "Credit Card") {
                System.out.println("Credit Card payment is succesful maded. Your ticket is purchased.");
            } else if (payment == "E-wallet") {
                System.out.println("E-Wallet payment is succesful maded. Your ticket is purchased");
            } else {
                System.out.println("Cash Payment is succesful maded. Your ticket is purchased.");
            }
        } else if (movie == "avatar") {
            System.out.println("The ticket price is rm25");
            if (payment == "Credit Card") {
                System.out.println("Credit Card payment is succesful maded. Your ticket is purchased.");
            } else if (payment == "E-wallet") {
                System.out.println("E-Wallet payment is succesful maded. Your ticket is purchased");
            } else {
                System.out.println("Cash Payment is succesful maded. Your ticket is purchased.");
            }
        }
    }
}
