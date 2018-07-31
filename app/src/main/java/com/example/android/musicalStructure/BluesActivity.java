package com.example.android.musicalStructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class BluesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_list);

        //create a list of artists and songs
        ArrayList<Music> music = new ArrayList<>();
        music.add(new Music("B.B. King", "Three O' Clock Blues", R.drawable.play));
        music.add(new Music("John Lee Hooker", "I'm In The Mood", R.drawable.play));
        music.add(new Music("Robert Johnson", "Sweet Home Chicago", R.drawable.play));
        music.add(new Music("Howlin' Wolf", "Back Door Man", R.drawable.play));
        music.add(new Music("Lightnin' Slim", "The Things I Use To Do", R.drawable.play));
        music.add(new Music("Muddy Waters", "Hoochie Coochie Man", R.drawable.play));
        music.add(new Music("T-Bone Walker", "Stormy Monday", R.drawable.play));
        music.add(new Music("Elmore James", "Dust My Broom", R.drawable.play));
        music.add(new Music("Big Bill Broonzy", "Key To The Highway", R.drawable.play));
        music.add(new Music("Little Walter", "Juke", R.drawable.play));

        // Create an {@link MusicAdapter}, whose data source is a list of {@link Music}s. The
        // adapter knows how to create list items for each item in the list.
        MusicAdapter adapter = new MusicAdapter(this, music);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link MusicAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        ImageButton bluesy = (ImageButton) findViewById(R.id.bluesButton);
        bluesy.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the classical category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ClassicalActivity}
                Intent myBluesIntent = new Intent(BluesActivity.this, BluesActivity.class);

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
                Intent myClassicalIntent = new Intent(BluesActivity.this, ClassicalActivity.class);

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
                Intent myDanceIntent = new Intent(BluesActivity.this, DanceActivity.class);

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
                Intent myHipHopIntent = new Intent(BluesActivity.this, HipHopActivity.class);

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
                Intent myNowPlayingIntent = new Intent(BluesActivity.this, NowPlayingActivity.class);

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
                Intent myRapIntent = new Intent(BluesActivity.this, RapActivity.class);

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
                Intent myRockIntent = new Intent(BluesActivity.this, RockActivity.class);

                // Start the new activity
                startActivity(myRockIntent);
            }
        });
    }
}
