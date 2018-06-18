package in.co.ikai.chandigarhtourguide.feature;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

import in.co.ikai.chandigarhtourguide.feature.adapters.RestaurantAdapter;
import in.co.ikai.chandigarhtourguide.feature.dataModels.Restaurant;

public class FamousRestaurantsActivity extends AppCompatActivity {

    // Declaring global objects.
    private ArrayList<Restaurant> restaurantArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famous_restaurants);

        // Setting Activity title.
        setTitle(R.string.famous_restaurants);

        // Getting reference of listView;
        ListView restaurantListView = findViewById(R.id.restaurant_list_view);

        // preparing data into arraylist.
        prepareData();

        // Setting Adapter.
        RestaurantAdapter mAdapter = new RestaurantAdapter(this, restaurantArrayList);

        // Setting adapter to list view.
        restaurantListView.setAdapter(mAdapter);

        // Enabling back navigation.
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    private void prepareData() {
        restaurantArrayList.add(new Restaurant(getString(R.string.name_swagath)
                , getString(R.string.desc_swagath)
                , getString(R.string.address_swagath)
                , "0172 500 2626", R.drawable.swagath_restaurant));

        restaurantArrayList.add(new Restaurant(getString(R.string.name_virgin)
                , getString(R.string.desc_virgin)
                , getString(R.string.address_virgin)
                , "086990 00999", R.drawable.virgin_courtyard));

        restaurantArrayList.add(new Restaurant(getString(R.string.name_pal)
                , getString(R.string.desc_pal)
                , getString(R.string.address_pal)
                , "0172 504 6214", R.drawable.pal_dhaba));

        restaurantArrayList.add(new Restaurant(getString(R.string.name_gng)
                , getString(R.string.desc_gng)
                , getString(R.string.address_gng)
                , "0172 434 5010", R.drawable.garlic_and_greens));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
