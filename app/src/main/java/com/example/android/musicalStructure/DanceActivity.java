package com.example.android.musicalStructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class DanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        //create a list of artists and songs
        ArrayList<Music> music = new ArrayList<>();
        music.add(new Music("Pharrell Williams", "Happy", R.drawable.play));
        music.add(new Music("David Guetta", "Flames", R.drawable.play));
        music.add(new Music("Enrique Iglesias", "Move To Miami", R.drawable.play));
        music.add(new Music("Cardi B", "I Like It", R.drawable.play));
        music.add(new Music("Calvin Harris", "One Kiss", R.drawable.play));
        music.add(new Music("Marshmello", "Friends", R.drawable.play));
        music.add(new Music("Drake", "Nice For What", R.drawable.play));
        music.add(new Music("Maroon 5", "Girls Like You", R.drawable.play));
        music.add(new Music("Bruno Mars", "Uptown Funk", R.drawable.play));
        music.add(new Music("Jennifer Lopez", "On The Floor", R.drawable.play));

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
                Intent myBluesIntent = new Intent(DanceActivity.this, BluesActivity.class);

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
                Intent myClassicalIntent = new Intent(DanceActivity.this, ClassicalActivity.class);

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
                Intent myDanceIntent = new Intent(DanceActivity.this, DanceActivity.class);

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
                Intent myHipHopIntent = new Intent(DanceActivity.this, HipHopActivity.class);

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
                Intent myNowPlayingIntent = new Intent(DanceActivity.this, NowPlayingActivity.class);

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
                Intent myRapIntent = new Intent(DanceActivity.this, RapActivity.class);

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
                Intent myRockIntent = new Intent(DanceActivity.this, RockActivity.class);

                // Start the new activity
                startActivity(myRockIntent);
            }
        });
    }
}
