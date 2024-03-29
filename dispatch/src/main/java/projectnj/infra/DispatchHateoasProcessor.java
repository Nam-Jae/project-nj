package projectnj.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import projectnj.domain.*;

@Component
public class DispatchHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Dispatch>> {

    @Override
    public EntityModel<Dispatch> process(EntityModel<Dispatch> model) {
        return model;
    }
}
