package com.fda.restaurant.restaurant.dao;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import static lombok.AccessLevel.PUBLIC;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="Restaurant")
@FieldDefaults(level = PUBLIC)
public class Restaurant {
    @Id
    String id;
    String restaurantName;
    VegOrNonVeg vegOrNonVeg;
    Cuisines cuisines;
    Integer priceForTwo;
    Dishes dishes;

    public Restaurant( String restaurantName, VegOrNonVeg vegOrNonVeg, Cuisines cuisines, Integer priceForTwo, Dishes dishes) {

        this.restaurantName = restaurantName;
        this.vegOrNonVeg = vegOrNonVeg;
        this.cuisines = cuisines;
        this.priceForTwo = priceForTwo;
        this.dishes = dishes;
    }
}
