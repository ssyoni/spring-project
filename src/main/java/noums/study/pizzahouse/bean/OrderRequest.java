package noums.study.pizzahouse.bean;

import lombok.Getter;
import lombok.Setter;
import noums.study.pizzahouse.enums.FoodMenu;
import noums.study.pizzahouse.enums.Pay;
import noums.study.pizzahouse.pay.PayMethod;

@Getter
@Setter
public class OrderRequest {

   // private PizzaMenu pizzaMenu;
    private FoodMenu menu;
    private int count;
    private Pay pay;

}
