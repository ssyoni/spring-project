package noums.study.pizzahouse.makers.pizzamaker;

import noums.study.pizzahouse.enums.PizzaMenu;
import org.springframework.stereotype.Component;

@Component
public class PotatoPizzaMaker implements PizzaMaker {

    @Override
    public PizzaMenu getMenu() {
        return PizzaMenu.POTATO_PIZZA;
    }

    @Override
    public String prepare() {
        return "포테이토 피자 준비";
    }

    @Override
    public String bake() {
        return "포테이토 피자 굽기";
    }


}
