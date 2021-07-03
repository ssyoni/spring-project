package noums.study.pizzahouse.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import noums.study.pizzahouse.enums.Menu;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class OrderInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int seq;

    @Enumerated(value = EnumType.STRING)
    private Menu menu;

    private int count;
    private int totalPrice;

    @CreationTimestamp
    private LocalDateTime createDt;
    @UpdateTimestamp
    private LocalDateTime updateDt;

}
