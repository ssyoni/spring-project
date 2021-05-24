package noums.study.pizzahouse.service;

import org.springframework.stereotype.Service;

@Service
public class PayService {

    public String pay(int price) {
        return price + "결제";
    }

}
