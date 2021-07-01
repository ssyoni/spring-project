package noums.study.pizzahouse.pay.payment;

import noums.study.pizzahouse.enums.PayMethod;
import noums.study.pizzahouse.pay.manager.PaymentMethod;

public class CashPayment implements PaymentMethod {
    @Override
    public PayMethod getPayMethod() {
        return PayMethod.CASH;
    }

    @Override
    public String pay(PayMethod method, int amount) {
        System.out.println("현금 결제 진행");
        return null;
    }
}
