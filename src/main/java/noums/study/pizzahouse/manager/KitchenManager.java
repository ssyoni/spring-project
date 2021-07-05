package noums.study.pizzahouse.manager;

import lombok.RequiredArgsConstructor;
import noums.study.pizzahouse.enums.FoodMenu;
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
        Collection<FoodManager> managerCollection = applicationContext.getBeansOfType(FoodManager.class).values();
        for (FoodManager foodManager : managerCollection) {
            if (managers.put(foodManager.getPart(),foodManager) != null){
                throw new IllegalArgumentException("makers put 과정에서 에러 발생");
            }
        }
    }

    public String makeFood(FoodMenu menu) {
        FoodManager foodManager = managers.get(menu.getPart());  // part : 치킨 -> 치킨매니처 호출
        System.out.println(foodManager.getPart());
        return foodManager.makeFood(menu);
    }
}
