package noums.study.pizzahouse.makers.pizzamaker;

import noums.study.pizzahouse.enums.FoodMenu;
import org.springframework.stereotype.Component;

@Component
public class BulgogiPizzaMaker implements PizzaMaker{
    @Override
    public FoodMenu getMenu() {
        return FoodMenu.BULGOGI_PIZZA;
    }

    @Override
    public String prepare() {
        return "불고기 피자 준비";
    }

    @Override
    public String bake() {
        return "불고기 피자 굽기";
    }

}
