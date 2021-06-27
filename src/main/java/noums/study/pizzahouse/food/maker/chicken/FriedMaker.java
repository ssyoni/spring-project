package noums.study.pizzahouse.food.maker.chicken;

import noums.study.pizzahouse.enums.Menu;
import org.springframework.stereotype.Component;

@Component
public class FriedMaker implements ChickenMaker {

    @Override
    public Menu getMenu() {
        return Menu.FRIED_CHICKEN;
    }

    @Override
    public String prepare() {
        return "후라이드 치 준비";
    }

    @Override
    public String frying() {
        return "후라이드 치킨 튀기기";
    }

}
