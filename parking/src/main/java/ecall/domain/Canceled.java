package ecall.domain;

import ecall.domain.*;
import ecall.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Canceled extends AbstractEvent {

    private Long id;
    private String parkingId;
    private String customerId;
    private String carNumber;
    private Double amount;
    private String status;
}
