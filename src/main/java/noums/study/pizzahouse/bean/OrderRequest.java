package noums.study.pizzahouse.bean;

import lombok.Getter;
import lombok.Setter;
import noums.study.pizzahouse.enums.ChickenMenu;
import noums.study.pizzahouse.enums.PizzaMenu;

@Getter
@Setter
public class OrderRequest {

    private PizzaMenu pizzaMenu;
    private int count;
    private String payMethod;

}
