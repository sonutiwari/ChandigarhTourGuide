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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famous_places);

        // Setting activity title.
        setTitle(R.string.famous_places);

        // Preparing array list.
        prepareData();

        // Getting reference of list and setting adapter.
        ListView famousPlacesListView = findViewById(R.id.list_famous_places);
        LocationAdapter.FamousPlacesItemClickListener mListener = this;
        LocationAdapter mAdapter = new LocationAdapter(this, locationArrayList, mListener);
        famousPlacesListView.setAdapter(mAdapter);

        // Enabling back navigation.
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public void prepareData() {

        locationArrayList.add(new Location(getString(R.string.name_rg)
                , R.string.rock_garden_description
                , getString(R.string.wiki_rg)
                , R.drawable.rock_garden)
        );

        locationArrayList.add(new Location(getString(R.string.name_rose)
                , R.string.rose_garden_description
                , getString(R.string.wiki_rosse)
                , R.drawable.rose_garden)
        );

        locationArrayList.add(new Location(getString(R.string.name_sl)
                , R.string.sukhna_lake_description
                , getString(R.string.wiki_sl)
                , R.drawable.sukhna_lake)
        );

        locationArrayList.add(new Location(getString(R.string.name_elante)
                , R.string.elante_description
                , getString(R.string.wiki_elante)
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
