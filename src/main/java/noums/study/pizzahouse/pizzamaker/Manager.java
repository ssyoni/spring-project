package noums.study.pizzahouse.pizzamaker;


import lombok.RequiredArgsConstructor;
import noums.study.pizzahouse.enums.Menu;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Component
public class Manager {

    final private ApplicationContext applicationContext;

    private Map<Menu, Maker> makers = new HashMap<>();

    @PostConstruct
    public void init() {
        Collection<Maker> makerCollection = applicationContext.getBeansOfType(Maker.class).values();
        for (Maker maker : makerCollection) {
            if (makers.put(maker.getMenu(), maker) != null) {
                throw new IllegalArgumentException("makers put 과정에서 에러 발생");
            }
        }
    }

    public String makePizza(Menu menu) {
        Maker maker = makers.get(menu);
        maker.prepare();
        maker.makeDough();
        maker.bake();
        return "pizza";
    }

}
