package in.co.ikai.chandigarhtourguide.feature;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

import in.co.ikai.chandigarhtourguide.feature.adapters.ShoppingMallAdapter;
import in.co.ikai.chandigarhtourguide.feature.dataModels.ShoppingMall;

public class FamousShopsActivity extends AppCompatActivity {

    private ArrayList<ShoppingMall> shoppingMallArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famous_shops);

        // Setting Activity title.
        setTitle(R.string.famous_restaurants);

        // Getting reference of listView;
        ListView shoppingMallListView = findViewById(R.id.shopping_mall_list_view);

        // preparing data into array list.
        prepareData();

        // Setting Adapter.
        ShoppingMallAdapter mAdapter = new ShoppingMallAdapter(this, shoppingMallArrayList);

        // Setting adapter to list view.
        shoppingMallListView.setAdapter(mAdapter);

        // Enabling back navigation.
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    private void prepareData() {
        shoppingMallArrayList.add(new ShoppingMall(getString(R.string.name_elante)
                , getString(R.string.address_elante), getString(R.string.opening_hrs_elante)
                , "0172 500 5000"));

        shoppingMallArrayList.add(new ShoppingMall(getString(R.string.name_sm)
                , getString(R.string.address_sm)
                , getString(R.string.opening_hrs_sm)
                , getString(R.string.no_ph_no)));

        shoppingMallArrayList.add(new ShoppingMall(getString(R.string.name_tdi)
                , getString(R.string.address_tdi)
                , getString(R.string.opening_hrs_tdi)
                , "096460 89376"));

        shoppingMallArrayList.add(new ShoppingMall(getString(R.string.name_gp)
                , getString(R.string.address_gp)
                , getString(R.string.opening_hrs_gp)
                , "076961 11122"));
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
