package umc.study.service.restaurantService;

import java.util.List;
import java.util.Optional;
import umc.study.domain.Restaurant;

public interface RestaurantQueryService {

    Optional<Restaurant> findRestaurant(Long id);
    List<Restaurant> findRestaurantByNameAndStarPoints(String name, Double starPoints);
}
