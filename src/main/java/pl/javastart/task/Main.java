package pl.javastart.task;

public class Main {
    public static void main(String[] args) {
        SalesRepresentative salesRepresentative = new SalesRepresentative();

        // to nie powinno być możliwe
        salesRepresentative.config.setMinRequiredEarnings(0);

        Offer offer = salesRepresentative.createLoanOffer(1_000_000, 2000);

        // to również nie powinno być możliwe
        offer.setValid(true);
        offer.setPercentage(- 0.5);
        offer.setValue(2_000_000);

        CustomerService customerService = new CustomerService();
        customerService.payoutOffer(offer);
    }
}