package com.moringaschool.musicapp;

import android.os.Bundle;
import android.widget.TextView;

public class MusicActivity {

    private TextView mLocationTextView;
    private ListView mListView;
    private String[] restaurants = new String[] {"Mi Mero Mole", "Mother's Bistro",
            "Life of Pie", "Screen Door", "Luc Lac", "Sweet Basil",
            "Slappy Cakes", "Equinox", "Miss Delta's", "Andina",
            "Lardo", "Portland City Grill", "Fat Head's Brewery",
            "Chipotle", "Subway"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        mListView = (ListView) findViewById(R.id.listView);
        mLocationTextView = (TextView) findViewById(R.id.locationTextView);

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mLocationTextView.setText("Here are all the restaurants near: " + location);
    }
}
