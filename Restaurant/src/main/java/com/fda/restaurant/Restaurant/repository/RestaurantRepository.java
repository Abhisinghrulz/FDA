package com.fda.restaurant.Restaurant.repository;

import com.fda.restaurant.Restaurant.dao.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository  extends MongoRepository<Restaurant,String> {
}
