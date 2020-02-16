package com.fda.restaurant.Restaurant.service;

import com.fda.restaurant.Restaurant.dao.Restaurant;
import com.fda.restaurant.Restaurant.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;


    public void addRestaurant(Restaurant restaurant) {
        restaurantRepository.save(restaurant);
    }

    public List<Restaurant> getRestaurant() {
        return restaurantRepository.findAll();
    }

    public Optional<Restaurant> getRestaurantById(String id) {
        return restaurantRepository.findById(id);
    }

    public Restaurant updateRestaurant(Restaurant newRestaurant, String id) {
        return restaurantRepository.findById(id)
                .map(restaurant -> {
                    restaurant.setDishes(newRestaurant.getDishes());
                    restaurant.setCuisines(newRestaurant.getCuisines());
                    restaurant.setRestaurantName(newRestaurant.getRestaurantName());
                    restaurant.setVegOrNonVeg(newRestaurant.getVegOrNonVeg());
                    restaurant.setPriceForTwo(newRestaurant.getPriceForTwo());
                    return restaurantRepository.save(restaurant);
                })
                .orElseGet(() -> {
                    newRestaurant.setId(id);
                    return restaurantRepository.save(newRestaurant);
                });

    }
}
