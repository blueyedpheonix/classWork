package classes;

import java.util.ArrayList;
import java.util.List;

public class coponSystem {
    private static coponSystem cop;
    private List<Coupon> coupons = new ArrayList<>();
    private coponSystem(){}
    public static coponSystem getInstance(){
        if (cop == null){
            cop = new coponSystem();
        }
        return cop;
    }

    public List<Coupon> getAll(){
        return coupons;
    }
    public void addCoupon(Coupon coupon){
        coupons.add(coupon);
    }
}
