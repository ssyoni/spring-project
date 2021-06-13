package noums.study.pizzahouse.enums;

import lombok.Getter;

@Getter
public enum ChickenMenu {

    FRIED_CHICKEN(10000),
    OVEN_CHICKEN(12000),
    HOTSOURCE_CHICKEN(15000);

    private int price;

    ChickenMenu(int price) { this.price = price;}
}
