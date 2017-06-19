package com.example.android.centralscreentourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class SightsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sights);

        // Create an ArrayList of Sight objects
        ArrayList<Sight> sights = new ArrayList<Sight>();
        sights.add(new Sight("Parlaiment", "Budapest, Kossuth Lajos tér 1-3, 1055", R.drawable.parlaiment));
        sights.add(new Sight("National Museum", "Budapest, Múzeum krt. 14-16, 1088", R.drawable.national_museum));
        sights.add(new Sight("St Stephen`s Basilica", "Budapest, Szent István tér 1, 1051", R.drawable.st_stephans_basilica));
        sights.add(new Sight("The Chain Bridge", "Budapest Széchenyi Lánchíd, 1051", R.drawable.parlaiment));

        // Create an {@link SightAdapter}, whose data source is a list of
        // {@link Sight}s. The adapter knows how to create list item views for each item
        // in the list.
        SightAdapter sightAdapter = new SightAdapter(this, sights);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list_sights);
        listView.setAdapter(sightAdapter);

    }}
