package noums.study.pizzahouse.pay.manager;

import lombok.RequiredArgsConstructor;
import noums.study.pizzahouse.enums.Menu;
import noums.study.pizzahouse.enums.PayMethod;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Component
public class PaymentManager {

    final private ApplicationContext applicationContext;

    private Map<PayMethod, PaymentMethod> managers = new HashMap<>();

    @PostConstruct
    public void init() {
        Collection<PaymentMethod> managerCollection = applicationContext.getBeansOfType(PaymentMethod.class).values();
        for (PaymentMethod manager : managerCollection) {
            if (managers.put(manager.getPaymentMethod(), manager) != null) {
                throw new IllegalArgumentException("managers put 과정에서 에러 발생");
            }
        }
    }

    public String processPayment(PaymentMethod method, int amount) {


        return null;
    }

}
