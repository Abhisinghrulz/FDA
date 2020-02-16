package com.fda.restaurant.Restaurant.controller;

import com.fda.restaurant.Restaurant.dao.Restaurant;
import com.fda.restaurant.Restaurant.exception.ResourceNotFoundException;
import com.fda.restaurant.Restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @PostMapping("/addRestaurant")
    public ResponseEntity<String> addRestaurant(@RequestBody Restaurant restaurant)
    {
        restaurantService.addRestaurant(restaurant) ;
        return new ResponseEntity<>("Restaurant is successfully added", HttpStatus.OK);
    }

    @GetMapping("/getAllRestaurant")
    public ResponseEntity<List<Restaurant>> getRestaurant()
    {
        List<Restaurant> restaurants = restaurantService.getRestaurant();
        return new ResponseEntity<>(restaurants, HttpStatus.OK);
    }

    @GetMapping("/getRestaurantById/{id}")
    public Restaurant getRestaurantById(@PathVariable String id) throws ResourceNotFoundException {
        return restaurantService.getRestaurantById(id).
                orElseThrow(() -> new ResourceNotFoundException("Restaurant Not Found for this id"));
    }

    @PutMapping("/updateRestaurant/{id}")
    public ResponseEntity<Restaurant> updateRestaurant(@RequestBody Restaurant restaurant, @PathVariable String id)
    {
        Restaurant restaurantUpdated = restaurantService.updateRestaurant(restaurant, id);

        return new ResponseEntity<>(restaurantUpdated, HttpStatus.OK);
    }

    public ResponseEntity<String> deleteAllRestaurant()
    {
        return new ResponseEntity<>("All restaurants have been deleted",HttpStatus.OK);
    }
    public ResponseEntity<String> deleteRestaurant()
    {
        return new ResponseEntity<>("Restaurant is successfully added", HttpStatus.OK);
    }



}
