package com.fda.Restaurant.Restaurant.service;

import com.fda.restaurant.restaurant.dao.Dishes;
import com.fda.restaurant.restaurant.dao.Restaurant;
import com.fda.restaurant.restaurant.repository.RestaurantRepository;
import com.fda.restaurant.restaurant.service.RestaurantService;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import static com.fda.restaurant.restaurant.dao.Cuisines.INDIAN;
import static com.fda.restaurant.restaurant.dao.VegOrNonVeg.VEG;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
public class RestaurantServiceTest {

    @Mock
    private RestaurantRepository restaurantRepository;

    @InjectMocks
    private RestaurantService restaurantService;

    private List<Restaurant> listOfRestaurants;
    private Restaurant restaurant;
    private Restaurant updatedRestaurant;
    private Restaurant expectedRestaurant;
    private String id = "AB1";

    public RestaurantServiceTest(){

    }


    @BeforeEach
    public void setUp() {
        listOfRestaurants = new LinkedList<>();
        restaurant = new Restaurant(id,"Delhi Pub", VEG, INDIAN,400,new Dishes("COFFEE",100));
        listOfRestaurants.add(restaurant);
        updatedRestaurant = new Restaurant(id,"Delhi Wild", VEG, INDIAN,400,new Dishes("COFFEE",100));
        expectedRestaurant = new Restaurant(id,"Delhi Wild", VEG, INDIAN,400,new Dishes("COFFEE",100));

    }

    @Test
    public void updateRestaurant() {
        Mockito.when(restaurantRepository.findById(id)).thenReturn(Optional.of(restaurant));
        assertEquals(expectedRestaurant,restaurantService.updateRestaurant(updatedRestaurant,id));
    }
}