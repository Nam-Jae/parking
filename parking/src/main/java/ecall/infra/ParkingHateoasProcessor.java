package ecall.infra;

import ecall.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ParkingHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Parking>> {

    @Override
    public EntityModel<Parking> process(EntityModel<Parking> model) {
        return model;
    }
}
