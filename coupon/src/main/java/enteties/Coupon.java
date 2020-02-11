package enteties;

import java.time.LocalDate;
import java.util.Objects;

public class Coupon {
    private long id;
    private LocalDate expired;
    private CouponType type;
    private double price;
    private int amount;
    private String messege;
    private String image;
    private long comanyId;

    public Coupon(long id, LocalDate expired, CouponType type,
                  double price, int amount, String messege, String image, long comanyId) {
        this.id = id;
        this.expired = expired;
        this.type = type;
        this.price = price;
        this.amount = amount;
        this.messege = messege;
        this.image = image;
        this.comanyId = comanyId;
    }

    public Coupon(LocalDate expired, CouponType type, double price, int amount,
                  String messege, String image, long comanyId) {
        this.expired = expired;
        this.type = type;
        this.price = price;
        this.amount = amount;
        this.messege = messege;
        this.image = image;
        this.comanyId = comanyId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getExpired() {
        return expired;
    }

    public void setExpired(LocalDate expired) {
        this.expired = expired;
    }

    public CouponType getType() {
        return type;
    }

    public void setType(CouponType type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getMessege() {
        return messege;
    }

    public void setMessege(String messege) {
        this.messege = messege;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public long getComanyId() {
        return comanyId;
    }

    public void setComanyId(long comanyId) {
        this.comanyId = comanyId;
    }

    @Override
    public String toString() {
        return "Coupon{" +
                "id=" + id +
                ", expired=" + expired +
                ", type=" + type +
                ", price=" + price +
                ", amount=" + amount +
                ", messege='" + messege + '\'' +
                ", image='" + image + '\'' +
                ", comanyId=" + comanyId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coupon coupon = (Coupon) o;
        return Double.compare(coupon.price, price) == 0 &&
                amount == coupon.amount &&
                comanyId == coupon.comanyId &&
                Objects.equals(expired, coupon.expired) &&
                type == coupon.type &&
                Objects.equals(messege, coupon.messege) &&
                Objects.equals(image, coupon.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expired, type, price, amount, messege, image, comanyId);
    }
}
