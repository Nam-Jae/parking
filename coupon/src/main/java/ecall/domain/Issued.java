package ecall.domain;

import ecall.domain.*;
import ecall.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class Issued extends AbstractEvent {

    private Long id;
    private String customerId;
    private String reservationId;

    public Issued(Coupon aggregate) {
        super(aggregate);
    }

    public Issued() {
        super();
    }
}
//>>> DDD / Domain Event
