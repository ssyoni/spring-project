package noums.study.pizzahouse.manager;

import noums.study.pizzahouse.enums.FoodMenu;

public interface FoodManager {

    public String getPart();
    public String makeFood(FoodMenu foodMenu);
}
