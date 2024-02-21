package ecall.domain;

import ecall.domain.*;
import ecall.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class Retrieved extends AbstractEvent {

    private Long id;
    private String customerId;
    private String reservationId;

    public Retrieved(Coupon aggregate) {
        super(aggregate);
    }

    public Retrieved() {
        super();
    }
}
//>>> DDD / Domain Event
