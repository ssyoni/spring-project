package noums.study.pizzahouse.maker.chicken;


import lombok.RequiredArgsConstructor;
import noums.study.pizzahouse.enums.Menu;
import noums.study.pizzahouse.manager.FoodManager;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Component
public class ChickenManager implements FoodManager {

    final private ApplicationContext applicationContext;

    private Map<Menu, ChickenMaker> makers = new HashMap<>();

    @PostConstruct
    public void init() {
        Collection<ChickenMaker> makerCollection = applicationContext.getBeansOfType(ChickenMaker.class).values();
        for (ChickenMaker maker : makerCollection) {
            if (makers.put(maker.getMenu(), maker) != null) {
                throw new IllegalArgumentException("makers put 과정에서 에러 발생");
            }
        }
    }

    @Override
    public String makeFood(Menu menu) {
        ChickenMaker maker = makers.get(menu);
        maker.prepare();
        maker.frying();
        return "chicken";
    }

    @Override
    public String getPart() {
        return "CHICKEN";
    }

}
