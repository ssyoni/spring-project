package noums.study.pizzahouse.enums;

import lombok.Getter;

@Getter
public enum PizzaMenu {

    BULGOGI_PIZZA(10000),
    CHEESE_PIZZA(8000),
    POTATO_PIZZA(11000);

    private int price;

    PizzaMenu(int price) { this.price = price;}
}
