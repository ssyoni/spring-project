package noums.study.pizzahouse.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Getter
public enum Menu {

    BULGOGI_PIZZA(10000, "PIZZA"),
    CHEESE_PIZZA(8000, "PIZZA"),
    POTATO_PIZZA(11000, "PIZZA"),

    GARLIC_CHICKEN(15000, "CHICKEN"),
    FRIED_CHICKEN(12000, "CHICKEN"),

    NONE(0, "");
    ;

    private static Map<String, Menu> FORMAT_MAP = Stream
            .of(Menu.values())
            .collect(Collectors.toMap(s -> s.name(), Function.identity()));

    private int price;
    private String part;

    Menu(int price, String part) {
        this.price = price;
        this.part = part;
    }

    @JsonCreator // This is the factory method and must be static
    public static Menu fromString(String string) {
        System.out.println("json creator");
        return Optional
                .ofNullable(FORMAT_MAP.get(string))
                .orElse(NONE);
    }


}
