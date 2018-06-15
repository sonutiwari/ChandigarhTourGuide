package in.co.ikai.chandigarhtourguide.feature;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

import in.co.ikai.chandigarhtourguide.feature.adapters.LocationAdapter;
import in.co.ikai.chandigarhtourguide.feature.dataModels.Location;

public class FamousPlacesActivity extends AppCompatActivity
        implements LocationAdapter.FamousPlacesItemClickListener {

    // Global objects.
    private ArrayList<Location> locationArrayList = new ArrayList<>();
    private ListView famousPlacesListView;
    private LocationAdapter mAdapter;
    private LocationAdapter.FamousPlacesItemClickListener mListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famous_places);

        // Setting activity title.
        setTitle(R.string.famous_places);

        // Preparing array list.
        prepareData();

        // Getting reference of list and setting adapter.
        famousPlacesListView = findViewById(R.id.list_famous_places);
        mListener = this;
        mAdapter = new LocationAdapter(this, locationArrayList, mListener);
        famousPlacesListView.setAdapter(mAdapter);

        // Enabling back navigation.
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public void prepareData() {

        locationArrayList.add(new Location("Rock Garden"
                , R.string.rock_garden_description
                , "https://en.wikipedia.org/wiki/Rock_Garden_of_Chandigarh"
                , R.drawable.rock_garden)
        );

        locationArrayList.add(new Location("Rose Garden"
                , R.string.rose_garden_description
                , "https://en.wikipedia.org/wiki/Zakir_Hussain_Rose_Garden"
                , R.drawable.rose_garden)
        );

        locationArrayList.add(new Location("Sukhna Lake"
                , R.string.sukhna_lake_description
                , "https://en.wikipedia.org/wiki/Sukhna_Lake"
                , R.drawable.sukhna_lake)
        );

        locationArrayList.add(new Location("Elante Mall"
                , R.string.elante_description
                , "https://en.wikipedia.org/wiki/Elante_Mall"
                , R.drawable.elante_mall)
        );
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


    @Override
    public void moreButtonClickListener(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}
