package com.example.android.musicalStructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class HipHopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        //create a list of artists and songs
        ArrayList<Music> music = new ArrayList<>();
        music.add(new Music("Busta Rhymes", "Pass The Courvoisier", R.drawable.play));
        music.add(new Music("Big Boi", "Lookin' 4 Ya", R.drawable.play));
        music.add(new Music("TI", "Big himgs Poppin", R.drawable.play));
        music.add(new Music("Junior Mafia", "Get Money", R.drawable.play));
        music.add(new Music("Terror Squad", "Lean Back", R.drawable.play));
        music.add(new Music("Timbaland", "The Way I Are", R.drawable.play));
        music.add(new Music("Chingy", "Right Thurr", R.drawable.play));
        music.add(new Music("Missy Elliott", "Work It", R.drawable.play));
        music.add(new Music("Ludacris", "Stand Up", R.drawable.play));
        music.add(new Music("Black Eyed Peas", "I Gotta Feeling", R.drawable.play));

        // Create an {@link MusicAdapter}, whose data source is a list of {@link music}s. The
        // adapter knows how to create list items for each item in the list.
        MusicAdapter adapter = new MusicAdapter(this, music);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        ImageButton bluesy = (ImageButton) findViewById(R.id.bluesButton);
        bluesy.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the classical category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ClassicalActivity}
                Intent myBluesIntent = new Intent(HipHopActivity.this, BluesActivity.class);

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
                Intent myClassicalIntent = new Intent(HipHopActivity.this, ClassicalActivity.class);

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
                Intent myDanceIntent = new Intent(HipHopActivity.this, DanceActivity.class);

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
                Intent myHipHopIntent = new Intent(HipHopActivity.this, HipHopActivity.class);

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
                Intent myNowPlayingIntent = new Intent(HipHopActivity.this, NowPlayingActivity.class);

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
                Intent myRapIntent = new Intent(HipHopActivity.this, RapActivity.class);

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
                Intent myRockIntent = new Intent(HipHopActivity.this, RockActivity.class);

                // Start the new activity
                startActivity(myRockIntent);
            }
        });
    }
}
