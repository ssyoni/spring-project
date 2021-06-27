package noums.study.pizzahouse.pay.payment;

import noums.study.pizzahouse.enums.PayMethod;
import noums.study.pizzahouse.pay.manager.PaymentMethod;

public class PointPayment implements PaymentMethod {
    @Override
    public PayMethod getPaymentMethod() {
        return PayMethod.POINT;
    }

    @Override
    public String pay(PayMethod method, int amount) {
        return null;
    }
}
