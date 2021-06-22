package noums.study.pizzahouse.service;

import lombok.RequiredArgsConstructor;
import noums.study.pizzahouse.bean.OrderRequest;
import noums.study.pizzahouse.manager.KitchenManager;
import noums.study.pizzahouse.manager.PizzaManager;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class OrderService {

    final private KitchenManager kitchenManager;
    final private PayService payService;

    public String order(OrderRequest req) {
        // 주문
        // ...
        // 결제
        //payService.pay(req.getPizzaMenu().getPrice());
        // 제조
        kitchenManager.callManager(req.getMenu());
        return "complete";
    }


}
