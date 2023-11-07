package stmallchoa.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import stmallchoa.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "selectAProducts",
    path = "selectAProducts"
)
public interface SelectAProductRepository
    extends PagingAndSortingRepository<SelectAProduct, Long> {}
