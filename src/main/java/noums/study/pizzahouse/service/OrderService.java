package noums.study.pizzahouse.service;

import lombok.RequiredArgsConstructor;
import noums.study.pizzahouse.bean.OrderRequest;
import noums.study.pizzahouse.entity.OrderInfo;
import noums.study.pizzahouse.food.manager.KitchenManager;
import noums.study.pizzahouse.repository.OrderRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class OrderService {

    final private KitchenManager manager;
    final private PayService payService;
    final private OrderRepository repository;

    public String order(OrderRequest req) {
        OrderInfo order = new OrderInfo();
        order.setCount(req.getCount());
        order.setMenu(req.getMenu());
        order.setTotalPrice(req.getCount() * req.getMenu().getPrice());
        repository.save(order);
        // 주문
        // ...
        // 결제
        payService.pay(req.getPayMethod(), req.getMenu().getPrice());
        // 제조
        manager.makeFood(req.getMenu());
        return "complete";
    }


}
