package noums.study.pizzahouse.maker.chicken;

import noums.study.pizzahouse.enums.Menu;

public interface ChickenMaker {

    public Menu getMenu();

    public String prepare();

    public String frying();

}
