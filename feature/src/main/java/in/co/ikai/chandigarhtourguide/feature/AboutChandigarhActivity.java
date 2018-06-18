package in.co.ikai.chandigarhtourguide.feature;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class AboutChandigarhActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_chandigarh);

        // Setting title of the activity.
        setTitle(R.string.about_chandigarh);

        // Getting reference of the more button and explicitly call intent to corresponding
        // Wikipedia page.
        Button moreInformationButton = findViewById(R.id.btn_more);
        moreInformationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                String Url = getString(R.string.wiki_cdg);
                intent.setData(Uri.parse(Url));
                startActivity(intent);
            }
        });

        // Enabling back navigation.
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
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
