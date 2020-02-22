package com.fda.restaurant.restaurant.repository;

import com.fda.restaurant.restaurant.dao.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository  extends MongoRepository<Restaurant,String> {
}
