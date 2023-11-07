package stmallchoa.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import stmallchoa.DeliveryApplication;
import stmallchoa.domain.DeliveryCanceled;
import stmallchoa.domain.DeliveryCompleted;
import stmallchoa.domain.DeliveryReturned;
import stmallchoa.domain.DeliveryStarted;

@Entity
@Table(name = "DeliveryMgmt_table")
@Data
//<<< DDD / Aggregate Root
public class DeliveryMgmt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userId;

    private Long oderId;

    private String productName;

    private Long productId;

    private Integer qty;

    private String status;

    private Date deliveryDt;

    @PostPersist
    public void onPostPersist() {
        DeliveryStarted deliveryStarted = new DeliveryStarted(this);
        deliveryStarted.publishAfterCommit();
    }

    @PostUpdate
    public void onPostUpdate() {
        DeliveryCanceled deliveryCanceled = new DeliveryCanceled(this);
        deliveryCanceled.publishAfterCommit();

        DeliveryCompleted deliveryCompleted = new DeliveryCompleted(this);
        deliveryCompleted.publishAfterCommit();

        DeliveryReturned deliveryReturned = new DeliveryReturned(this);
        deliveryReturned.publishAfterCommit();
    }

    @PreUpdate
    public void onPreUpdate() {}

    public static DeliveryMgmtRepository repository() {
        DeliveryMgmtRepository deliveryMgmtRepository = DeliveryApplication.applicationContext.getBean(
            DeliveryMgmtRepository.class
        );
        return deliveryMgmtRepository;
    }

    //<<< Clean Arch / Port Method
    public static void startDelivery(Ordered ordered) {
        //implement business logic here:

        /** Example 1:  new item 
        DeliveryMgmt deliveryMgmt = new DeliveryMgmt();
        repository().save(deliveryMgmt);

        DeliveryStarted deliveryStarted = new DeliveryStarted(deliveryMgmt);
        deliveryStarted.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(ordered.get???()).ifPresent(deliveryMgmt->{
            
            deliveryMgmt // do something
            repository().save(deliveryMgmt);

            DeliveryStarted deliveryStarted = new DeliveryStarted(deliveryMgmt);
            deliveryStarted.publishAfterCommit();

         });
        */

    }

    //>>> Clean Arch / Port Method
    //<<< Clean Arch / Port Method
    public static void cancelDelivery(OrderCanceled orderCanceled) {
        //implement business logic here:

        /** Example 1:  new item 
        DeliveryMgmt deliveryMgmt = new DeliveryMgmt();
        repository().save(deliveryMgmt);

        DeliveryCanceled deliveryCanceled = new DeliveryCanceled(deliveryMgmt);
        deliveryCanceled.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(orderCanceled.get???()).ifPresent(deliveryMgmt->{
            
            deliveryMgmt // do something
            repository().save(deliveryMgmt);

            DeliveryCanceled deliveryCanceled = new DeliveryCanceled(deliveryMgmt);
            deliveryCanceled.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
