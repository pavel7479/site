package ru.pavel.site.repo;

 import org.springframework.data.repository.CrudRepository;
import ru.pavel.site.models.Construction;

public interface ConstructionRepository extends CrudRepository <Construction, Long> {

}
