package ecall.infra;

import ecall.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class CouponHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Coupon>> {

    @Override
    public EntityModel<Coupon> process(EntityModel<Coupon> model) {
        return model;
    }
}
