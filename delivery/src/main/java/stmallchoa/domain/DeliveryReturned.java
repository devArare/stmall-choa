package stmallchoa.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmallchoa.domain.*;
import stmallchoa.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryReturned extends AbstractEvent {

    private Long id;
    private String userId;
    private Long oderId;
    private Long productId;
    private Integer qty;

    public DeliveryReturned(DeliveryMgmt aggregate) {
        super(aggregate);
    }

    public DeliveryReturned() {
        super();
    }
}
//>>> DDD / Domain Event
