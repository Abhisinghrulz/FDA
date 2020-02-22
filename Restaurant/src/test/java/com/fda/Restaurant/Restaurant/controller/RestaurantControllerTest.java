package com.fda.Restaurant.Restaurant.controller;


import com.fda.restaurant.restaurant.controller.RestaurantController;
import com.fda.restaurant.restaurant.dao.Dishes;
import com.fda.restaurant.restaurant.dao.Restaurant;
import com.fda.restaurant.restaurant.service.RestaurantService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.LinkedList;
import java.util.List;

import static com.fda.restaurant.restaurant.dao.Cuisines.INDIAN;
import static com.fda.restaurant.restaurant.dao.VegOrNonVeg.VEG;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class RestaurantControllerTest {

    @Mock
    private RestaurantService restaurantService;

    @InjectMocks
    private RestaurantController restaurantController;

    private List<Restaurant> listOfRestaurants;
    private Restaurant restaurant;

    @BeforeEach
    void setUp() {
        listOfRestaurants = new LinkedList<>();
        restaurant = new Restaurant("AB1","Delhi Pub", VEG, INDIAN,400,new Dishes("COFFEE",100));
        listOfRestaurants.add(restaurant);

    }


    @Test
    public void getRestaurant() {
        Mockito.when(restaurantService.getRestaurant()).thenReturn(listOfRestaurants);
        assertEquals(listOfRestaurants,restaurantController.getRestaurant().getBody());
    }

    @Test
    public void updateRestaurant()
    {
        Mockito.when(restaurantService.updateRestaurant(restaurant,"AB1")).thenReturn(restaurant);
        assertEquals(restaurant,restaurantController.updateRestaurant(restaurant,"AB1").getBody());
    }

    @AfterEach
    void tearDown() {
    }
}