package projectnj.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import projectnj.domain.*;
import projectnj.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class CallCanceled extends AbstractEvent {

    private Long id;
    private String carId;
    private String driverName;
    private String position;
    private String accidentTime;

    public CallCanceled(Call aggregate) {
        super(aggregate);
    }

    public CallCanceled() {
        super();
    }
}
//>>> DDD / Domain Event
