package noums.study.pizzahouse.pay.manager;

import noums.study.pizzahouse.enums.PayMethod;

public interface PaymentMethod {

    public PayMethod getPaymentMethod();

    public String pay(PayMethod method, int amount);

}
