package noums.study.pizzahouse.controller;

import lombok.RequiredArgsConstructor;
import noums.study.pizzahouse.bean.OrderRequest;
import noums.study.pizzahouse.enums.FoodMenu;
import noums.study.pizzahouse.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/orders")
@RequiredArgsConstructor
@RestController
public class OrderController {

    final private OrderService service;

    @PostMapping()
    public ResponseEntity<?> order(@RequestBody OrderRequest req) {
        System.out.println("post controller");
        return ResponseEntity.ok(service.order(req));
    }

    @GetMapping()
    public ResponseEntity<?> orderTest(@RequestBody OrderRequest req) {
        OrderRequest request = new OrderRequest();
        req.setMenu(FoodMenu.BULGOGI_PIZZA);
        return ResponseEntity.ok(service.order(req));
    }

}
