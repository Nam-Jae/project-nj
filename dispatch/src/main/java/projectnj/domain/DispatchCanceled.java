package projectnj.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import projectnj.domain.*;
import projectnj.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DispatchCanceled extends AbstractEvent {

    private Long id;
    private String carId;
    private String carType;
    private String driverName;
    private String dispatchTime;

    public DispatchCanceled(Dispatch aggregate) {
        super(aggregate);
    }

    public DispatchCanceled() {
        super();
    }
}
//>>> DDD / Domain Event
