package noums.study.pizzahouse.service;

import lombok.RequiredArgsConstructor;
import noums.study.pizzahouse.bean.OrderRequest;
import noums.study.pizzahouse.food.manager.KitchenManager;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class OrderService {

    final private KitchenManager manager;
    final private PayService payService;

    public String order(OrderRequest req) {
        // 주문
        // ...
        // 결제
        payService.pay(req.getPayMethod(), req.getMenu().getPrice());
        // 제조
        manager.makeFood(req.getMenu());
        return "complete";
    }


}
