package in.co.ikai.chandigarhtourguide.feature.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import in.co.ikai.chandigarhtourguide.feature.R;
import in.co.ikai.chandigarhtourguide.feature.dataModels.Restaurant;

public class RestaurantAdapter extends ArrayAdapter {
    // Declaring global objects.
    private Context mContext;
    private ArrayList<Restaurant> restaurantArrayList;

    public RestaurantAdapter(@NonNull Context context, ArrayList<Restaurant> restaurantArrayList) {
        super(context, 0, restaurantArrayList);
        mContext = context;
        this.restaurantArrayList = restaurantArrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.single_restaurant_view
                    , parent, false);

        final Restaurant currentRestaurant = restaurantArrayList.get(position);

        ImageView restaurantImageView = listItem.findViewById(R.id.image_famous_restaurants);
        restaurantImageView.setImageResource(currentRestaurant.getRestaurantImageId());

        TextView restaurantNameTextView = listItem.findViewById(R.id.txt_name_of_restaurant);
        restaurantNameTextView.setText(currentRestaurant.getRestaurantName());

        TextView restaurantDescriptionTextView =
                listItem.findViewById(R.id.txt_description_of_restaurant);
        restaurantDescriptionTextView.setText(currentRestaurant.getRestaurantDescription());

        TextView restaurantAddressTextView = listItem.findViewById(R.id.txt_address_of_restaurant);
        restaurantAddressTextView.setText(currentRestaurant.getRestaurantLocation());

        TextView restaurantContactTextView = listItem.findViewById(R.id.txt_restaurant_contact);
        restaurantContactTextView.setText(currentRestaurant.getRestaurantContact());

        return listItem;
    }
}
