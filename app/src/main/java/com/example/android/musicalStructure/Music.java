/*
+ * Copyright (C) 2016 The Android Open Source Project
+ *
+ * Licensed under the Apache License, Version 2.0 (the "License");
+ * you may not use this file except in compliance with the License.
+ * You may obtain a copy of the License at
+ *
+ *      http://www.apache.org/licenses/LICENSE-2.0
+ *
+ * Unless required by applicable law or agreed to in writing, software
+ * distributed under the License is distributed on an "AS IS" BASIS,
+ * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
+ * See the License for the specific language governing permissions and
+ * limitations under the License.
+ */
package com.example.android.musicalStructure;

/**
 * {@link Music} represents the music that the user wants to listen to.
 * It contains an artist and a song for that music.
 */

public class Music{

    /**artist transition for the music*/
    private String mArtist;

    /**song transition for the music*/
    private String mSong;

    /**Drawable resource ID*/
    private int mImageId;

    /**
     * Create a new music object
     * @param artist is the name of the artist.
     * @param song is the name of the song.
     * @param image is the play jpg.
     */
    public Music(String artist, String song,int image){
        mArtist = artist;
        mSong = song;
        mImageId = image;
    }

    /**
     * Get the artist name.
     */
    public String getArtist(){
        return mArtist;
    }

    /**
     * Get the song name.
     */
    public String getSong(){
        return mSong;
    }

    /**
    *Get the image ID
    */

    public int getImageId() {
        return mImageId;
    }

}
