package umc.study.reposistory.restaurantRepository;

import java.util.List;
import umc.study.domain.Restaurant;

public interface RestaurantRepositoryCustom {
    List<Restaurant> dynamicQueryWithBooleanBuilder(String name, Double starPoints);
}
