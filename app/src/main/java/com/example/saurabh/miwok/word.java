package com.example.saurabh.miwok;

/**
 * Created by saurabhs on 9/29/17.
 *
 * {@link word} Represeints vocabulary word and presents with methids to get the miwok as well as translated word
 */

public class word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int imageResourceId;


    public word(String miwok, String translated, int imageResourceId) {
        this.mMiwokTranslation = miwok;
        this.mDefaultTranslation = translated;
        this.imageResourceId = imageResourceId;
    }

    public word(String miwok, String translated) {
        this.mMiwokTranslation = miwok;
        this.mDefaultTranslation = translated;
    }

    public String getTranslation() {
        return mMiwokTranslation;
    }

    public String getMiwokWord() {
        return mDefaultTranslation;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
