package noums.study.pizzahouse.pizzamaker;

import noums.study.pizzahouse.enums.Menu;

public interface Maker {



    default String makeDough() {
     return "도우 만들기";
    }

    public Menu getMenu();

    public String prepare();

    public String bake();



}
