package umc.study.reposistory.restaurantRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.study.domain.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long>, RestaurantRepositoryCustom {

}
