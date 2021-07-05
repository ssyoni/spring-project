package noums.study.pizzahouse.makers.chickenmaker;

import noums.study.pizzahouse.enums.FoodMenu;
import org.springframework.stereotype.Component;

@Component
public class OvenChickenMaker implements ChickenMaker{

    @Override
    public FoodMenu getMenu() {
        return FoodMenu.OVEN_CHICKEN;
    }

    @Override
    public String prepare() {
        return "오븐 치킨 준비";
    }

    @Override
    public String make() {
        return "닭 굽기";
    }
}
