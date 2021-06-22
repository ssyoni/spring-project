package noums.study.pizzahouse.makers.chickenmaker;

import noums.study.pizzahouse.enums.ChickenMenu;

public interface ChickenMaker  {

    default String makeDough() {
        return "닭 손질하기";
    }

    public ChickenMenu getMenu();

    public String prepare();

    public String make();

}
