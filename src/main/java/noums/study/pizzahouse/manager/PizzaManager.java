package noums.study.pizzahouse.manager;


import lombok.RequiredArgsConstructor;
import noums.study.pizzahouse.enums.FoodMenu;
import noums.study.pizzahouse.makers.pizzamaker.PizzaMaker;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Component
public class PizzaManager implements FoodManager{

    final private ApplicationContext applicationContext;

    private Map<FoodMenu, PizzaMaker> makers = new HashMap<>();

    @PostConstruct
    public void init() {
        Collection<PizzaMaker> pizzaMakerCollection = applicationContext.getBeansOfType(PizzaMaker.class).values(); // Maker 를 구현하고있는 모든 객체들을 가져옴
        for (PizzaMaker maker : pizzaMakerCollection) {
            if (makers.put(maker.getMenu(), maker) != null) {
                throw new IllegalArgumentException("makers put 과정에서 에러 발생");
            }
        }
    }


    @Override
    public String getPart() {
        return "pizza";
    }

    @Override
    public String makeFood(FoodMenu foodMenu) {
        PizzaMaker pizzaMaker = makers.get(foodMenu);
        pizzaMaker.prepare();
        pizzaMaker.makeDough();
        pizzaMaker.bake();
        return "pizza";
    }


}
