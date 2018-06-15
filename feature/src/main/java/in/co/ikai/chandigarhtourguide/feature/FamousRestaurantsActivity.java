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
    private ListView restaurantListView;
    private RestaurantAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famous_restaurants);

        // Setting Activity title.
        setTitle(R.string.famous_restaurants);

        // Getting reference of listView;
        restaurantListView = findViewById(R.id.restaurant_list_view);

        // preparing data into arraylist.
        prepareData();

        // Setting Adapter.
        mAdapter = new RestaurantAdapter(this, restaurantArrayList);

        // Setting adapter to list view.
        restaurantListView.setAdapter(mAdapter);

        // Enabling back navigation.
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    private void prepareData() {
        restaurantArrayList.add(new Restaurant("Swagath Restaurant And Bar"
                , "Mangalorean, Chettinad, Malabari and Mughlai seafood " +
                "dishes served in a refined dining room."
                , "SCO No.7, Madhya Marg, Sector 26, Chandigarh, 160019"
                , "0172 500 2626", R.drawable.swagath_restaurant));

        restaurantArrayList.add(new Restaurant("Virgin Courtyard"
                , "Mediterranean-style courtyard terrace restaurant offering" +
                " a selection of Italian dishes and wines."
                , "SCO 1A, Madhya Marg, Sector 7-C, Sector 7C, Chandigarh, 160007"
                , "086990 00999", R.drawable.virgin_courtyard));

        restaurantArrayList.add(new Restaurant("Pal Dhaba Chandigarh"
                , "Established in 1968, this classic dhaba venue serves " +
                "typical northern Indian fare with no fuss"
                , "SCO No.7, Madhya Marg, Sector 26, Chandigarh, 160019"
                , "0172 504 6214", R.drawable.pal_dhaba));

        restaurantArrayList.add(new Restaurant("Garlic And Greens"
                , "One of the best location to enjoy your delicious food" +
                " at Elante mall Chandigarh."
                , "178-178A, Purv Marg, Industrial Area Phase I, Chandigarh, 160002"
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
