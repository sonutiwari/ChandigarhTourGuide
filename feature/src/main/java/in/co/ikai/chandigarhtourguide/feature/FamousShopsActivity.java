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

    // declaring global objects.
    private ListView shoppingMallListView;
    private ArrayList<ShoppingMall> shoppingMallArrayList = new ArrayList<>();
    private ShoppingMallAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famous_shops);

        // Setting Activity title.
        setTitle(R.string.famous_restaurants);

        // Getting reference of listView;
        shoppingMallListView = findViewById(R.id.shopping_mall_list_view);

        // preparing data into array list.
        prepareData();

        // Setting Adapter.
        mAdapter = new ShoppingMallAdapter(this, shoppingMallArrayList);

        // Setting adapter to list view.
        shoppingMallListView.setAdapter(mAdapter);

        // Enabling back navigation.
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    private void prepareData() {
        shoppingMallArrayList.add(new ShoppingMall("Elante Mall"
                , "Plot No. 177/178A, Purv Marg, Industrial Area Phase 1" +
                ", MW Area, Chandigarh, 160002", "11AM-9:30AM"
                , "0172 500 5000"));

        shoppingMallArrayList.add(new ShoppingMall("Shashtri market"
                , "Sector 22 Market road sector 22 Chandigarh 160022"
                , "Closes at 9PM"
                , "No Phone No"));

        shoppingMallArrayList.add(new ShoppingMall("TDI Mall"
                , "TDI MALL, 17D, Sector 17, Chandigarh, 160017"
                , "Closes at 12AM"
                , "096460 89376"));

        shoppingMallArrayList.add(new ShoppingMall("Glass Palace"
                , "SCO-43, Madhya Marg, Sector 7-C, Chandigarh, 160019"
                , "Closes 8PM"
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
