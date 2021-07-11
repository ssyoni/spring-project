package noums.study.pizzahouse.pay;

import noums.study.pizzahouse.enums.Pay;
import org.springframework.stereotype.Component;

@Component
public class CashMethod implements PayMethod{
    @Override
    public Pay getPayMethod() {
        return Pay.CASH;
    }

    @Override
    public String pay(Pay pay, int price) {
        System.out.println("현금결제");
        return null;
    }
}
