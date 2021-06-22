package noums.study.pizzahouse.bean;

import lombok.Getter;
import lombok.Setter;
import noums.study.pizzahouse.enums.ChickenMenu;
import noums.study.pizzahouse.enums.FoodMenu;
import noums.study.pizzahouse.enums.PizzaMenu;

@Getter
@Setter
public class OrderRequest {

   // private PizzaMenu pizzaMenu;
    private FoodMenu menu;
    private int count;
    private String payMethod;

}
