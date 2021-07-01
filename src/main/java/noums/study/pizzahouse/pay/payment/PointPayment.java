package noums.study.pizzahouse.pay.payment;

import noums.study.pizzahouse.enums.PayMethod;
import noums.study.pizzahouse.pay.manager.PaymentMethod;
import org.springframework.stereotype.Component;

@Component
public class PointPayment implements PaymentMethod {
    @Override
    public PayMethod getPayMethod() {
        return PayMethod.POINT;
    }

    @Override
    public String pay(PayMethod method, int amount) {
        System.out.println("포인트 결제 진행");
        return null;
    }
}
