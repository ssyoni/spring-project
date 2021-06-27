package noums.study.pizzahouse.bean;

import lombok.Getter;
import lombok.Setter;
import noums.study.pizzahouse.enums.Menu;
import noums.study.pizzahouse.enums.PayMethod;

@Getter
@Setter
public class OrderRequest {

    private Menu menu;
    private int count;
    private PayMethod payMethod;

}
