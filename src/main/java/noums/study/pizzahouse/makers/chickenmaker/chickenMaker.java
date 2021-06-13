package noums.study.pizzahouse.makers.chickenmaker;

import noums.study.pizzahouse.enums.ChickenMenu;
import noums.study.pizzahouse.enums.PizzaMenu;

public interface chickenMaker {

    default String makeDough() {
        return "닭 손질하";
    }

    public ChickenMenu getMenu();

    public String prepare();

    public String make();

}
