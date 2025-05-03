package umc.study;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import umc.study.service.resetaurantService.RestaurantQueryService;

@SpringBootApplication
@EnableJpaAuditing
public class StudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(ApplicationContext ctx) {
        return args -> {
            RestaurantQueryService restaurantQueryService = ctx.getBean(RestaurantQueryService.class);


            String name = "한강식당";
            Double starPoints = 4.0;


            System.out.println("Executing findRestaurantByNameAndStarPoints with parameters:");
            System.out.println("Name: " + name);
            System.out.println("StarPoints: " + starPoints);


            restaurantQueryService.findRestaurantByNameAndStarPoints(name, starPoints)
                    .forEach(System.out::println);
        };
    }
}
