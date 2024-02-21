package ecall.infra;

import ecall.config.kafka.KafkaProcessor;
import ecall.domain.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class CenterViewHandler {

    //<<< DDD / CQRS
    @Autowired
    private CenterRepository centerRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenReserved_then_CREATE_1(@Payload Reserved reserved) {
        try {
            if (!reserved.validate()) return;

            // view 객체 생성
            Center center = new Center();
            // view 객체에 이벤트의 Value 를 set 함
            center.setParkingId(reserved.getParkingId());
            center.setCustomerId(reserved.getCustomerId());
            center.setCarNumber(reserved.getCarNumber());
            center.setAmount(reserved.getAmount());
            center.setStatus(reserved.getStatus());
            // view 레파지 토리에 save
            centerRepository.save(center);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenReserved_then_UPDATE_1(@Payload Reserved reserved) {
        try {
            if (!reserved.validate()) return;
            // view 객체 조회

            List<Center> centerList = centerRepository.findByCarId(
                reserved.getCarId()
            );
            for (Center center : centerList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                // view 레파지 토리에 save
                centerRepository.save(center);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //>>> DDD / CQRS
}
