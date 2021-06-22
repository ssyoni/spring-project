package noums.study.pizzahouse.enums;

import lombok.Getter;

@Getter
public enum FoodMenu {

    FRIED_CHICKEN(10000, "chicken"),
    OVEN_CHICKEN(12000, "chicken"),
    HOTSOURCE_CHICKEN(15000, "chicken"),

    BULGOGI_PIZZA(10000, "pizza"),
    CHEESE_PIZZA(8000, "pizza"),
    POTATO_PIZZA(11000, "pizza");



    private int price;
    private String part;

    FoodMenu(int price, String part) { this.price = price; this.part = part;}
}
