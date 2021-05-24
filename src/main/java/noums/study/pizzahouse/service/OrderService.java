package noums.study.pizzahouse.service;

import lombok.RequiredArgsConstructor;
import noums.study.pizzahouse.bean.OrderRequest;
import noums.study.pizzahouse.pizzamaker.Manager;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class OrderService {

    final private Manager manager;
    final private PayService payService;

    public String order(OrderRequest req) {
        // 주문
        // ...
        // 결제
        payService.pay(req.getMenu().getPrice());
        // 제조
        manager.makePizza(req.getMenu());
        return "complete";
    }


}
