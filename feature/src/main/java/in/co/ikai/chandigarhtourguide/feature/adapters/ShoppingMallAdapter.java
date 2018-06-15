package in.co.ikai.chandigarhtourguide.feature.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import in.co.ikai.chandigarhtourguide.feature.R;
import in.co.ikai.chandigarhtourguide.feature.dataModels.ShoppingMall;

public class ShoppingMallAdapter extends ArrayAdapter {

    // Declaring global objects.
    private Context mContext;
    private ArrayList<ShoppingMall> shoppingMallArrayList;

    public ShoppingMallAdapter(@NonNull Context context, ArrayList<ShoppingMall> shoppingMalls) {
        super(context, 0, shoppingMalls);
        mContext = context;
        shoppingMallArrayList = shoppingMalls;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.single_shopping_mall
                    , parent, false);

        final ShoppingMall currentShoppingMall = shoppingMallArrayList.get(position);

        TextView shoppinMallNameTextView = listItem.findViewById(R.id.txt_name_of_mall);
        shoppinMallNameTextView.setText(currentShoppingMall.getNameOfTheMall());


        TextView shoppinMallAddressTextView = listItem.findViewById(R.id.txt_address_of_mall);
        shoppinMallAddressTextView.setText(currentShoppingMall.getAddressOfTheMall());

        TextView shoppingMallOpeningHrsTextView = listItem.findViewById(R.id.txt_opening_hrs);
        shoppingMallOpeningHrsTextView.setText(currentShoppingMall.getOpeningHoursOfTheMall());

        TextView shoppinMallContactTextView = listItem.findViewById(R.id.txt_shopping_mall_contact);
        shoppinMallContactTextView.setText(currentShoppingMall.getPhoneNumberOfTheMall());

        return listItem;
    }
}
