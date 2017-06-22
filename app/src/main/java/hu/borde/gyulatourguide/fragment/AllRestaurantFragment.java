package hu.borde.gyulatourguide.fragment;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import hu.borde.gyulatourguide.R;
import hu.borde.gyulatourguide.adapter.RestaurantListAdapter;
import hu.borde.gyulatourguide.model.Restaurant;

public class AllRestaurantFragment extends Fragment {

    public AllRestaurantFragment() {
        super();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.restaurant_list, container, false);

        final List<Restaurant> restaurantList = createRestaurantList();

        RestaurantListAdapter itemsAdapter = new RestaurantListAdapter(getActivity(), restaurantList);

        ListView listView = (ListView) root.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Restaurant selectedHotel = restaurantList.get(position);

                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + selectedHotel.getName() + " " + selectedHotel.getAddress());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        return root;
    }

    protected List<Restaurant> createRestaurantList() {
        List<Restaurant> list = new ArrayList<>();
        Restaurant[] restaurants = {
                new Restaurant(getString(R.string.rest_sorpince), getString(R.string.rest_sorpince_add), Restaurant.RestaurantType.RESTAURANT),
                new Restaurant(getString(R.string.rest_tolgyfa), getString(R.string.rest_tolgyfa_add), Restaurant.RestaurantType.RESTAURANT),
                new Restaurant(getString(R.string.rest_gusto), getString(R.string.rest_gusto_add), Restaurant.RestaurantType.RESTAURANT),
                new Restaurant(getString(R.string.rest_patriota), getString(R.string.rest_patriota_add), Restaurant.RestaurantType.RESTAURANT),
                new Restaurant(getString(R.string.rest_varkonyi), getString(R.string.rest_varkonyi_add), Restaurant.RestaurantType.RESTAURANT)
        };
        Restaurant[] fastFood = {
                new Restaurant(getString(R.string.fast_hambi), getString(R.string.fast_hambi_add), Restaurant.RestaurantType.FASTFOOD),
                new Restaurant(getString(R.string.fast_matroz), getString(R.string.fast_matroz_add), Restaurant.RestaurantType.FASTFOOD),
                new Restaurant(getString(R.string.fast_kebab), getString(R.string.fast_kebab_add), Restaurant.RestaurantType.FASTFOOD),
                new Restaurant(getString(R.string.fast_burger), getString(R.string.fast_burger_add), Restaurant.RestaurantType.FASTFOOD),
                new Restaurant(getString(R.string.fast_scorpio), getString(R.string.fast_scorpio_add), Restaurant.RestaurantType.FASTFOOD)
        };
        Restaurant[] cafe = {
                new Restaurant(getString(R.string.cafe_centennial), getString(R.string.cafe_centennial_add), Restaurant.RestaurantType.CAFE),
                new Restaurant(getString(R.string.cafe_kezmuv), getString(R.string.cafe_kezmuv_add), Restaurant.RestaurantType.CAFE),
                new Restaurant(getString(R.string.cafe_bodoky), getString(R.string.cafe_bodoky_add), Restaurant.RestaurantType.CAFE),
                new Restaurant(getString(R.string.cafe_manuel), getString(R.string.cafe_manuel_add), Restaurant.RestaurantType.CAFE)
        };
        Restaurant[] bar = {
                new Restaurant(getString(R.string.bar_redhole), getString(R.string.bar_redhole_add), Restaurant.RestaurantType.BAR),
                new Restaurant(getString(R.string.bar_sorpatika), getString(R.string.bar_sorpatika_Add), Restaurant.RestaurantType.BAR),
                new Restaurant(getString(R.string.bar_27), getString(R.string.bar_27_add), Restaurant.RestaurantType.BAR),
                new Restaurant(getString(R.string.bar_alpha), getString(R.string.bar_alpha_add), Restaurant.RestaurantType.BAR),
                new Restaurant(getString(R.string.bar_paris), getString(R.string.bar_paris_add), Restaurant.RestaurantType.BAR)
        };

        list.addAll(Arrays.asList(restaurants));
        list.addAll(Arrays.asList(fastFood));
        list.addAll(Arrays.asList(cafe));
        list.addAll(Arrays.asList(bar));

        Collections.sort(list);

        return list;
    }
}
