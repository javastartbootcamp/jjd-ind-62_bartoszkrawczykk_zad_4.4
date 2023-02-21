package pl.javastart.task;

public class SalesRepresentative {

    public Config config;

    public SalesRepresentative() {
        this.config = new Config(2000, -0.5);
    }

    public Offer createLoanOffer(int requestedAmount, int earnings) {
        Offer offer = new Offer(true, 2000);
        if (earnings >= config.getMinRequiredEarnings()) {
            offer.setPercentage(config.getPercentage());
            offer.setValid(true);
            offer.setValue(requestedAmount);
        }
        return offer;
    }

}
