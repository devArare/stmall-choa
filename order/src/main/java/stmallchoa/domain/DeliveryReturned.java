package stmallchoa.domain;

import java.util.*;
import lombok.*;
import stmallchoa.domain.*;
import stmallchoa.infra.AbstractEvent;

@Data
@ToString
public class DeliveryReturned extends AbstractEvent {

    private Long id;
    private String userId;
    private Long oderId;
    private Long productId;
    private Integer qty;
}
