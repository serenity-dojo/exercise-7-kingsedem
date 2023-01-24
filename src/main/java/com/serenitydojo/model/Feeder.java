package com.serenitydojo.model;

import static com.serenitydojo.model.FoodType.*;

public class Feeder {
    public FoodType feeds(FoodType animal, boolean isPremium) {

        switch (animal) {
            case TUNA:
                return TUNA;
            case DOG_FOOD:
                return DOG_FOOD;
            case SALMON:
                return (isPremium) ? SALMON : TUNA;
            default:
                return CABBAGE;
        }
    }
}
