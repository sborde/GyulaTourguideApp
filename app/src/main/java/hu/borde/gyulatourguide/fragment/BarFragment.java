package hu.borde.gyulatourguide.fragment;

import java.util.Iterator;
import java.util.List;

import hu.borde.gyulatourguide.model.Restaurant;

public class BarFragment extends AllRestaurantFragment {

    protected List<Restaurant> createRestaurantList() {
        List<Restaurant> original = super.createRestaurantList();

        Iterator<Restaurant> it = original.iterator();

        while (it.hasNext()) {
            Restaurant r = it.next();
            if (r.getType() != Restaurant.RestaurantType.BAR) {
                it.remove();
            }
        }

        return original;
    }

}
