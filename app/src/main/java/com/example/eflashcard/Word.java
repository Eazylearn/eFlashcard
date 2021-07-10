package com.example.eflashcard;

import android.content.Context;

public class Word {
    String word;
    String definition;
    public Word(String word, String definition) {
        this.word = word;
        this.definition = definition;
    }

    public String getWord() {
        return word;
    }

    public String getDefinition() {
        return definition;
    }

    // Get the image ID in the drawable folder
    public int getImageID(Context context) {
        return context.getResources().getIdentifier(word, "drawable", context.getPackageName());
    }

    // Get the audio ID in the raw folder
    public int getAudioID(Context context) {
        return context.getResources().getIdentifier(word, "raw", context.getPackageName());
    }
}
