package ecall.domain;

import ecall.ParkingApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Parking_table")
@Data
//<<< DDD / Aggregate Root
public class Parking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long parkingSpot;

    @PostPersist
    public void onPostPersist() {}

    public static ParkingRepository repository() {
        ParkingRepository parkingRepository = ParkingApplication.applicationContext.getBean(
            ParkingRepository.class
        );
        return parkingRepository;
    }

    //<<< Clean Arch / Port Method
    public static void increaseParkingSpot(Reserved reserved) {
        //implement business logic here:

        /** Example 1:  new item 
        Parking parking = new Parking();
        repository().save(parking);

        */

        /** Example 2:  finding and process
        
        repository().findById(reserved.get???()).ifPresent(parking->{
            
            parking // do something
            repository().save(parking);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void decreaseParkingSpot(Canceled canceled) {
        //implement business logic here:

        /** Example 1:  new item 
        Parking parking = new Parking();
        repository().save(parking);

        */

        /** Example 2:  finding and process
        
        repository().findById(canceled.get???()).ifPresent(parking->{
            
            parking // do something
            repository().save(parking);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
