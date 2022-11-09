package liga.medical.commonmodule.core.repository;

import liga.medical.commonmodule.core.model.Exception;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExceptionRepository extends CrudRepository<Exception, Long> {

}
