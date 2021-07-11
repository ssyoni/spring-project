package noums.study.pizzahouse.pay;

import noums.study.pizzahouse.enums.Pay;
import org.springframework.stereotype.Component;

@Component
public class CardMethod implements PayMethod {
    @Override
    public Pay getPayMethod() {
        return Pay.CARD;
    }

    @Override
    public String pay(Pay pay, int amount) {
        System.out.println("카드결제");
        return null;
    }

}
