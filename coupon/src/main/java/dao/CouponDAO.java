package dao;

import enteties.Coupon;
import exeption.AlreadyExistsException;
import exeption.NotExistException;

import java.util.List;

public interface CouponDAO {

    Coupon getByCouponID(long couponId) throws NotExistException;

    List<Coupon> getAllCoupons();

    List<Coupon> getByCompanyId(long id);

    Coupon addCoupon(Coupon coupon) throws AlreadyExistsException;

    void deleteCoupon(long couponId) throws NotExistException;
}
