package ecall.domain;

import ecall.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class Reserved extends AbstractEvent {

    private Long id;
    private String parkingId;
    private String customerId;
    private String carNumber;
    private Double amount;
    private String status;
}
