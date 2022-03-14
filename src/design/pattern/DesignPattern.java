package design.pattern;

public class DesignPattern {

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        String movie = "Naruto";
        ticket.SelectedMovie(movie);

        String payment_method = "Cash";
        Payment payment = ticket.getPayment(payment_method);
        payment.MakePayment();

    }
}
