package stmallchoa.domain;

import java.util.*;
import lombok.*;
import stmallchoa.domain.*;
import stmallchoa.infra.AbstractEvent;

@Data
@ToString
public class Ordered extends AbstractEvent {

    private Long id;
    private String userId;
    private String productName;
    private Long productId;
    private Integer qty;
    private String status;
    private String address;
}
