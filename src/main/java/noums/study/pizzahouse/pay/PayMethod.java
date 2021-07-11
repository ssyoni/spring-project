package noums.study.pizzahouse.pay;

import noums.study.pizzahouse.enums.Pay;

public interface PayMethod {

    public Pay getPayMethod();
    public String pay(Pay pay, int price);

}
