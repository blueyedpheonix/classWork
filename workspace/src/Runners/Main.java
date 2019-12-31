package Runners;

import classes.Coupon;
import classes.coponSystem;

public class Main {
    public static void main(String[] args) {
        coponSystem a = coponSystem.getInstance();
        coponSystem b = coponSystem.getInstance();
        a.addCoupon(new Coupon(54));
        a.addCoupon(new Coupon(34));
        b.addCoupon(new Coupon(567));
        b.addCoupon(new Coupon(754));
        b.addCoupon(new Coupon(3));
        System.out.println(a.getAll());
        System.out.println(b.getAll());

    }
}
