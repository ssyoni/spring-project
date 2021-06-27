package noums.study.pizzahouse.food.maker.pizza;

import noums.study.pizzahouse.enums.Menu;

public interface PizzaMaker {



    default String makeDough() {
     return "도우 만들기";
    }

    public Menu getMenu();

    public String prepare();

    public String bake();



}
