package stmallchoa.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmallchoa.domain.*;
import stmallchoa.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryCanceled extends AbstractEvent {

    private Long id;
    private String userId;
    private Long oderId;
    private String productName;
    private Long productId;
    private Integer qty;
    private String status;
    private Date deliveryDt;

    public DeliveryCanceled(DeliveryMgmt aggregate) {
        super(aggregate);
    }

    public DeliveryCanceled() {
        super();
    }
}
//>>> DDD / Domain Event
