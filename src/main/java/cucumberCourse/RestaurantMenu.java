package cucumberCourse;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class RestaurantMenu {
    private ArrayList<RestaurantMenuItem> menuItems = new ArrayList<>();

    public void addMenuItem(RestaurantMenuItem restaurantMenuItem){
        this.menuItems.add(restaurantMenuItem);
    }

    public boolean doesItemExist(RestaurantMenuItem  restaurantMenuItem){
        return this.menuItems.contains(restaurantMenuItem);
    }
}
