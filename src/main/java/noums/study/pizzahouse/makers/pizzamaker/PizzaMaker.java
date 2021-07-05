package noums.study.pizzahouse.makers.pizzamaker;

import noums.study.pizzahouse.enums.FoodMenu;

public interface PizzaMaker  {

    // 인터페이스 default 알아보기 ....
    default String makeDough() {
     return "도우 만들기";
    }

    public FoodMenu getMenu();

    public String prepare();

    public String bake();



}
