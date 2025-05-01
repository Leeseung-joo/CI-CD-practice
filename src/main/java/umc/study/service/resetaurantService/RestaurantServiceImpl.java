package umc.study.service.resetaurantService;


import java.util.List;
import java.util.Optional;
import javax.swing.text.html.Option;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.study.domain.Restaurant;
import umc.study.reposistory.restaurantRepository.RestaurantRepository;
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class RestaurantServiceImpl implements RestaurantQueryService {

    private final RestaurantRepository restaurantRepository;

    @Override
    public Optional<Restaurant> findRestaurant(Long id){
        return restaurantRepository.findById(id);
    }

    @Override
    public List<Restaurant> findRestaurantByNameAndStarPoints(String name, Double starPoints){
        List<Restaurant> filteredRestaurants = restaurantRepository.dynamicQueryWithBooleanBuilder(name, starPoints);
        filteredRestaurants.forEach(restaurant -> {
            System.out.println("restaurant " + restaurant);
        });
        return filteredRestaurants;
    }

    }




