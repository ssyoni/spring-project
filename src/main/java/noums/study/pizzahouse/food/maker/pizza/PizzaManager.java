package noums.study.pizzahouse.food.maker.pizza;


import lombok.RequiredArgsConstructor;
import noums.study.pizzahouse.enums.Menu;
import noums.study.pizzahouse.food.manager.FoodManager;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Component
public class PizzaManager implements FoodManager {

    final private ApplicationContext applicationContext;

    private Map<Menu, PizzaMaker> makers = new HashMap<>();

    @PostConstruct
    public void init() {
        Collection<PizzaMaker> makerCollection = applicationContext.getBeansOfType(PizzaMaker.class).values();
        for (PizzaMaker maker : makerCollection) {
            if (makers.put(maker.getMenu(), maker) != null) {
                throw new IllegalArgumentException("makers put 과정에서 에러 발생");
            }
        }
    }

    @Override
    public String getPart() {
        return "PIZZA";
    }

    @Override
    public String makeFood(Menu menu) {
        PizzaMaker maker = makers.get(menu);
        maker.prepare();
        maker.makeDough();
        maker.bake();
        return "pizza";
    }

}
