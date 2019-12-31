package classes;

public class Coupon {
    double price;

    public Coupon(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Coupon{" +
                "price=" + price +
                '}';
    }
}
