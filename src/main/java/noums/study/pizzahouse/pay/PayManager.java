package noums.study.pizzahouse.pay;

import lombok.RequiredArgsConstructor;
import noums.study.pizzahouse.enums.Pay;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Component
public class PayManager {

    final private ApplicationContext applicationContext;

    // private Map<FoodMenu, ChickenMaker> managers = new HashMap<>();
    private Map<Pay, PayMethod> methods = new HashMap<>();

    @PostConstruct
    public void init() {
        Collection<PayMethod> methodCollection = applicationContext.getBeansOfType(PayMethod.class).values();
        for (PayMethod method : methodCollection) {
            if (methods.put(method.getPayMethod(), method) != null) {
                throw new IllegalArgumentException("method put 과정에서 에러 발생");
            }
        }
    }

    public String doPayProcess(Pay pay, int price) {
        System.out.println(">>>>>>>> methods :: " +  methods.get(pay));
        System.out.println(">>>>>>>> doPayProcess :: " + pay +"," + price);
        PayMethod payMethod = methods.get(pay);
        payMethod.pay(pay, price);
        return "결제 완료";
    }
}
