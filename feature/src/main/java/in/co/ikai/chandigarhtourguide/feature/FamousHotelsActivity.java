package in.co.ikai.chandigarhtourguide.feature;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

import in.co.ikai.chandigarhtourguide.feature.adapters.ShoppingMallAdapter;
import in.co.ikai.chandigarhtourguide.feature.dataModels.ShoppingMall;

public class FamousHotelsActivity extends AppCompatActivity {

    private ArrayList<ShoppingMall> shoppingMallArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famous_hotels);
        setTitle(R.string.famous_hotels);

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
        shoppingMallArrayList.add(new ShoppingMall(getString(R.string.name_jw)
                , getString(R.string.address_jw), getString(R.string.opening_hrs_elante)
                , "0172 395 5555"));

        shoppingMallArrayList.add(new ShoppingMall(getString(R.string.name_lalit)
                , getString(R.string.address_lalit)
                , getString(R.string.opening_hrs_sm)
                , "0172 444 7777"));
    }

    // Enabling back navigation action.
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
