package guru.springframework.repository;

import guru.springframework.doamin.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
