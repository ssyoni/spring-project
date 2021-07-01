package noums.study.pizzahouse.service;

import lombok.RequiredArgsConstructor;
import noums.study.pizzahouse.enums.PayMethod;
import noums.study.pizzahouse.pay.manager.PaymentManager;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PayService {

    private final PaymentManager paymentManager;

    public String pay(PayMethod payMethod, int price) {
        return paymentManager.processPayment(payMethod, price);
    }

}
