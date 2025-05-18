package umc.study.reposistory;

import java.util.Optional;
import org.springframework.stereotype.Repository;
import umc.study.domain.Food;
import umc.study.mapping.FavoriteFood;
@Repository
public interface FoodRepository {
    Optional<Food> findById(Long id);
    boolean existsById(Long id);
}
