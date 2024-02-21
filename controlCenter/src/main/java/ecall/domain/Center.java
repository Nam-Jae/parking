package ecall.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

//<<< EDA / CQRS
@Entity
@Table(name = "Center_table")
@Data
public class Center {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String parkingId;
    private String customerId;
    private String carNumber;
    private Double amount;
    private String status;
    private String couponId;
    private String reservationId;
}
