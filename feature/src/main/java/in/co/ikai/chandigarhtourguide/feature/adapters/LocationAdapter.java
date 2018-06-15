package in.co.ikai.chandigarhtourguide.feature.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import in.co.ikai.chandigarhtourguide.feature.R;
import in.co.ikai.chandigarhtourguide.feature.dataModels.Location;

public class LocationAdapter extends ArrayAdapter<Location> {

    // Declaring global objects.
    private Context mContext;
    private ArrayList<Location> locationArrayList;
    private FamousPlacesItemClickListener mListener;


    public LocationAdapter(@NonNull Context context, ArrayList<Location> locations
            , FamousPlacesItemClickListener listener) {
        super(context, 0, locations);
        mContext = context;
        locationArrayList = locations;
        mListener = listener;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItem = convertView;
        if (listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.single_famous_place_view
                    , parent, false);

        final Location currentLocation = locationArrayList.get(position);

        TextView locationNameTextView = listItem.findViewById(R.id.txt_name_of_the_place);
        locationNameTextView.setText(currentLocation.getNameOfThePlace());

        ImageView locationImageView = listItem.findViewById(R.id.image_famous_places);
        locationImageView.setImageResource(currentLocation.getImageIdOfThePlace());

        TextView locationDescriptionTextView =
                listItem.findViewById(R.id.txt_description_of_the_place);
        locationDescriptionTextView.setText(currentLocation.getDescriptionOfThePlace());

        Button moreButton = listItem.findViewById(R.id.btn_more);
        moreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.moreButtonClickListener(currentLocation.getLinkOfWikipediaPage());
            }
        });

        return listItem;
    }

    // This interface will enable us to listen individual item clicks.
    public interface FamousPlacesItemClickListener {
        void moreButtonClickListener(String url);
    }

}
