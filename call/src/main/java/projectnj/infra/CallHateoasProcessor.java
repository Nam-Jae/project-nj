package projectnj.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import projectnj.domain.*;

@Component
public class CallHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Call>> {

    @Override
    public EntityModel<Call> process(EntityModel<Call> model) {
        return model;
    }
}
