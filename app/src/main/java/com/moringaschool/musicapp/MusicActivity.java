package com.moringaschool.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MusicActivity extends AppCompatActivity {

    private String[] music = new String[] {"Drip Too Hard", "Everyday We Lit",
            "Go Flex", "Goosebumps", "The Grinch", "Gucci On My Way",
            "Money In the Grave", "Bounce Back", "Letter To My Daughter", "My Dawg",
            "Bouff Daddy", "Close Friends", "Congratulations",
            "Blow my Mind", "Dirty Iyanna"};

    private TextView mLocationTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        mLocationTextView = (TextView) findViewById(R.id.locationTextView);

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mLocationTextView.setText("Music In your Location" + location);
    }

}
