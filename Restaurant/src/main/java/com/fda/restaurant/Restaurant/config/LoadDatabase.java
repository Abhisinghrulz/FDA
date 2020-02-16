package com.fda.restaurant.Restaurant.config;

import com.fda.restaurant.Restaurant.dao.Dishes;
import com.fda.restaurant.Restaurant.dao.Restaurant;
import com.fda.restaurant.Restaurant.repository.RestaurantRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.fda.restaurant.Restaurant.dao.Cuisines.CHINESE;
import static com.fda.restaurant.Restaurant.dao.Cuisines.INDIAN;
import static com.fda.restaurant.Restaurant.dao.VegOrNonVeg.NON_VEG;
import static com.fda.restaurant.Restaurant.dao.VegOrNonVeg.VEG;

@Configuration
@Slf4j
class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(RestaurantRepository repository) {
        return args -> {
            log.info("PreLoading " + repository.save(new Restaurant("Delhi Pub", VEG, INDIAN,400,new Dishes("COFFEE",100))));
            log.info("PreLoading " + repository.save(new Restaurant("Delhi Continental", NON_VEG, CHINESE,600,new Dishes("SWEETS",600))));
        };
    }
}