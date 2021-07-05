package noums.study.pizzahouse.makers.chickenmaker;

import noums.study.pizzahouse.enums.FoodMenu;
import org.springframework.stereotype.Component;

@Component
public class FriedChickenMaker implements ChickenMaker {

    @Override
    public FoodMenu getMenu() {
        return FoodMenu.FRIED_CHICKEN;
    }

    @Override
    public String prepare() {
        return "후라이드 치킨 준비";
    }

    @Override
    public String make() {
        return "닭 튀기기";
    }
}
