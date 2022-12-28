package cucumberCourse;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RestaurantMenuItem {
    private String itemName;
    private String description;
    private int price;
}
