package stmallchoa.domain;

import java.util.*;
import lombok.*;
import stmallchoa.domain.*;
import stmallchoa.infra.AbstractEvent;

@Data
@ToString
public class StockIncreased extends AbstractEvent {

    private Long id;
    private String productName;
    private String productImg;
    private Integer stock;
}
