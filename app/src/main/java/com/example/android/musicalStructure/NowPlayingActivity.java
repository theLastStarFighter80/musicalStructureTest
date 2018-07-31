package com.example.android.musicalStructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list_0);

        //create a list of the artist and song that is currently playing
        ArrayList<Music_0> music_0 = new ArrayList<>();
        music_0.add(new Music_0("Marshmello", "Friends", R.drawable.now_playing_image));

        // Create an {@link Music0Adapter}, whose data source is a list of {@link music_0}s. The
        // adapter knows how to create list items for each item in the list.
        Music0Adapter adapter = new Music0Adapter(this, music_0);

        // Find the {@link ListView_0} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView_0} with the view ID called list_0, which is declared in the
        // activity_main.xml layout file.
        ListView listView_0 = (ListView) findViewById(R.id.list_0);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView_0.setAdapter(adapter);

        ImageButton bluesy = (ImageButton) findViewById(R.id.bluesButton);
        bluesy.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the classical category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ClassicalActivity}
                Intent myBluesIntent = new Intent(NowPlayingActivity.this, BluesActivity.class);

                // Start the new activity
                startActivity(myBluesIntent);
            }
        });

        ImageButton classy = (ImageButton) findViewById(R.id.classicalButton);
        classy.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the classical category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ClassicalActivity}
                Intent myClassicalIntent = new Intent(NowPlayingActivity.this, ClassicalActivity.class);

                // Start the new activity
                startActivity(myClassicalIntent);
            }
        });

        ImageButton dancer = (ImageButton) findViewById(R.id.danceButton);
        dancer.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the classical category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ClassicalActivity}
                Intent myDanceIntent = new Intent(NowPlayingActivity.this, DanceActivity.class);

                // Start the new activity
                startActivity(myDanceIntent);
            }
        });

        ImageButton hipHopper = (ImageButton) findViewById(R.id.hipHopButton);
        hipHopper.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the classical category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ClassicalActivity}
                Intent myHipHopIntent = new Intent(NowPlayingActivity.this, HipHopActivity.class);

                // Start the new activity
                startActivity(myHipHopIntent);
            }
        });

        ImageButton nowed = (ImageButton) findViewById(R.id.nowPlayingButton);
        nowed.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the classical category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ClassicalActivity}
                Intent myNowPlayingIntent = new Intent(NowPlayingActivity.this, NowPlayingActivity.class);

                // Start the new activity
                startActivity(myNowPlayingIntent);
            }
        });

        ImageButton rapper = (ImageButton) findViewById(R.id.rapButton);
        rapper.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the classical category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ClassicalActivity}
                Intent myRapIntent = new Intent(NowPlayingActivity.this, RapActivity.class);

                // Start the new activity
                startActivity(myRapIntent);
            }
        });

        ImageButton rocking = (ImageButton) findViewById(R.id.rockButton);
        rocking.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the classical category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ClassicalActivity}
                Intent myRockIntent = new Intent(NowPlayingActivity.this, RockActivity.class);

                // Start the new activity
                startActivity(myRockIntent);
            }
        });
    }
}
