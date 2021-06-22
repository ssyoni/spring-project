package noums.study.pizzahouse.makers.chickenmaker;

import noums.study.pizzahouse.enums.ChickenMenu;

public class OvenChickenMaker implements ChickenMaker{

    @Override
    public ChickenMenu getMenu() {
        return ChickenMenu.OVEN_CHICKEN;
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
