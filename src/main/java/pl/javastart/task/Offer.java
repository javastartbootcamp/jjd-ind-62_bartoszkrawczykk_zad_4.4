package pl.javastart.task;

public class Offer {

    private boolean valid;
    private double value;
    private double percentage;

    public Offer(boolean valid, double value, double percentage) {
        this(valid, value);
        this.percentage = percentage;
    }

    public Offer(boolean valid, double value) {
        this.valid = valid;
        this.value = value;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        if (value == 1000) {
            this.value = value;
        } else {
            System.out.println("Odmowa wypłaty");
        }
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
