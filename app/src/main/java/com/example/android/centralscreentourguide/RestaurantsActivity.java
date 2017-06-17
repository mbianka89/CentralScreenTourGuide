package com.example.android.centralscreentourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);


            // Create a list of restaurants
            ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();
            restaurants.add(new Restaurant("Trofea Grill Restaurant", "+36 1 251 6377"));
            restaurants.add(new Restaurant("Árnyas Restaurant", "+36 1 212 5681"));


            // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
            // adapter knows how to create list items for each item in the list.
            RestaurantAdapter adapter = new RestaurantAdapter(this, restaurants);

            // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
            // There should be a {@link ListView} with the view ID called list, which is declared in the
            // activity_restaurants.xml layout file.
            ListView listView = (ListView) findViewById(R.id.list_restaurants);

            // Make the {@link ListView} use the {@link RestaurantAdapter} we created above, so that the
            // {@link ListView} will display list items for each {@link Restaurant} in the list.
            listView.setAdapter(adapter);
        }

    }
