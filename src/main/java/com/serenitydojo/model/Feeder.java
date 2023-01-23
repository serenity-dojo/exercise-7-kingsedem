package com.serenitydojo.model;



public class Feeder {
    public String feeds(FoodType animal, boolean isPremium) {

        switch (animal) {
            case TUNA:
                return "Tuna";
            case DOG_FOOD:
                return "Dog Food";
            case  SALMON:
                return (isPremium) ? "Salmon" : "Tuna";
            default:
                return "Cabbage";
        }

    }
}
