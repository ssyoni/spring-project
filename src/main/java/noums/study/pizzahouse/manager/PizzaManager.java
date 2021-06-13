package noums.study.pizzahouse.manager;


import lombok.RequiredArgsConstructor;
import noums.study.pizzahouse.enums.PizzaMenu;
import noums.study.pizzahouse.makers.pizzamaker.PizzaMaker;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Component
public class PizzaManager {

    final private ApplicationContext applicationContext;

    private Map<PizzaMenu, PizzaMaker> makers = new HashMap<>();

    @PostConstruct
    public void init() {
        Collection<PizzaMaker> pizzaMakerCollection = applicationContext.getBeansOfType(PizzaMaker.class).values(); // Maker 를 구현하고있는 모든 객체들을 가져옴
        for (PizzaMaker pizzaMaker : pizzaMakerCollection) {
            if (makers.put(pizzaMaker.getMenu(), pizzaMaker) != null) {
                throw new IllegalArgumentException("makers put 과정에서 에러 발생");
            }
        }
    }

    // 피자 종류별로 인터페이스를 구현한 이유 !
    // 피자 종류가 많아지면 조건식으로 처리하기가 한계가 있음....
    // ㅠ_ㅠ.... 8_8....어떡하지...ㅠㅠ...

    public String makePizza(PizzaMenu pizzaMenu) {
        PizzaMaker pizzaMaker = makers.get(pizzaMenu);
        pizzaMaker.prepare();
        pizzaMaker.makeDough();
        pizzaMaker.bake();
        return "pizza";
    }

}
