package ecall.domain;

import ecall.CouponApplication;
import ecall.domain.Issued;
import ecall.domain.Retrieved;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Coupon_table")
@Data
//<<< DDD / Aggregate Root
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String customerId;

    private String reservationId;

    @PostPersist
    public void onPostPersist() {
        Issued issued = new Issued(this);
        issued.publishAfterCommit();
    }

    @PreRemove
    public void onPreRemove() {
        Retrieved retrieved = new Retrieved(this);
        retrieved.publishAfterCommit();
    }

    public static CouponRepository repository() {
        CouponRepository couponRepository = CouponApplication.applicationContext.getBean(
            CouponRepository.class
        );
        return couponRepository;
    }

    //<<< Clean Arch / Port Method
    public static void addCouponList(Reserved reserved) {
        //implement business logic here:

        /** Example 1:  new item 
        Coupon coupon = new Coupon();
        repository().save(coupon);

        */

        /** Example 2:  finding and process
        
        repository().findById(reserved.get???()).ifPresent(coupon->{
            
            coupon // do something
            repository().save(coupon);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void deleteCouponList(Canceled canceled) {
        //implement business logic here:

        /** Example 1:  new item 
        Coupon coupon = new Coupon();
        repository().save(coupon);

        */

        /** Example 2:  finding and process
        
        repository().findById(canceled.get???()).ifPresent(coupon->{
            
            coupon // do something
            repository().save(coupon);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
