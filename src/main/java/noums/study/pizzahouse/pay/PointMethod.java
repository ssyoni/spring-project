package noums.study.pizzahouse.pay;

import noums.study.pizzahouse.enums.Pay;
import org.springframework.stereotype.Component;

@Component
public class PointMethod implements PayMethod{
    @Override
    public Pay getPayMethod() {
        return Pay.POINT;
    }

    @Override
    public String pay(Pay pay, int price) {
        System.out.println("포인트결제");
        return null;
    }
}
