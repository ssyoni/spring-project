package noums.study.pizzahouse.makers.chickenmaker;

import noums.study.pizzahouse.enums.ChickenMenu;

public class FriedChickenMaker implements ChickenMaker {

    @Override
    public ChickenMenu getMenu() {
        return ChickenMenu.FRIED_CHICKEN;
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
