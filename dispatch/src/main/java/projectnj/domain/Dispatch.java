package projectnj.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import projectnj.DispatchApplication;
import projectnj.domain.DispatchCanceled;
import projectnj.domain.Dispatched;

@Entity
@Table(name = "Dispatch_table")
@Data
//<<< DDD / Aggregate Root
public class Dispatch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String carId;

    private String carType;

    private String driverName;

    private String dispatchTime;

    @PostPersist
    public void onPostPersist() {
        Dispatched dispatched = new Dispatched(this);
        dispatched.publishAfterCommit();

        DispatchCanceled dispatchCanceled = new DispatchCanceled(this);
        dispatchCanceled.publishAfterCommit();
    }

    public static DispatchRepository repository() {
        DispatchRepository dispatchRepository = DispatchApplication.applicationContext.getBean(
            DispatchRepository.class
        );
        return dispatchRepository;
    }

    //<<< Clean Arch / Port Method
    public static void getHelp(Called called) {
        //implement business logic here:

        /** Example 1:  new item 
        Dispatch dispatch = new Dispatch();
        repository().save(dispatch);

        */

        /** Example 2:  finding and process
        
        repository().findById(called.get???()).ifPresent(dispatch->{
            
            dispatch // do something
            repository().save(dispatch);


         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void malfunction(CallCanceled callCanceled) {
        //implement business logic here:

        /** Example 1:  new item 
        Dispatch dispatch = new Dispatch();
        repository().save(dispatch);

        */

        /** Example 2:  finding and process
        
        repository().findById(callCanceled.get???()).ifPresent(dispatch->{
            
            dispatch // do something
            repository().save(dispatch);


         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
