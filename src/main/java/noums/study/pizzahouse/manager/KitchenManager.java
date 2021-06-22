package noums.study.pizzahouse.manager;

import lombok.RequiredArgsConstructor;
import noums.study.pizzahouse.enums.ChickenMenu;
import noums.study.pizzahouse.enums.FoodMenu;
import noums.study.pizzahouse.makers.chickenmaker.ChickenMaker;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.*;

@RequiredArgsConstructor
@Component
public class KitchenManager {

    final private ApplicationContext applicationContext;

    private Map<String, FoodManager> managers = new HashMap<>();

    @PostConstruct
    public void init(){
        Collection<FoodManager> chickenMakerCollection = applicationContext.getBeansOfType(FoodManager.class).values();
        for (FoodManager foodManager : chickenMakerCollection) {
            if (managers.put(foodManager.getPart(),foodManager) != null){
                throw new IllegalArgumentException("makers put 과정에서 에러 발생");
            }
        }
    }

    public void callManager(FoodMenu foodMenu) { // 오븐치킨 ..
        FoodManager foodManager = managers.get(foodMenu.getPart());  // part : 치킨 -> 치킨매니처 호출
        foodManager.makeFood(foodMenu);
    }
}
