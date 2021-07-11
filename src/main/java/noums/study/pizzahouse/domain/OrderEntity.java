package noums.study.pizzahouse.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import noums.study.pizzahouse.enums.FoodMenu;
import org.springframework.boot.autoconfigure.web.WebProperties;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private FoodMenu menu;

    private String price;

    @Builder
    public OrderEntity(FoodMenu menu, String price){
        this.menu = menu;
        this.price = price;
    }

}
