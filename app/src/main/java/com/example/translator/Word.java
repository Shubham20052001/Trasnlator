package com.example.translator;

import android.graphics.drawable.Drawable;

public class Word {
    private String mDefaultTranslation;
    private String mJapaneeseTranslation;
    private int mImageResourceID;
    private int mAudioResourceID;


    public Word(String defaultTranslation,String japaneeseTranslation,int audioResourceId){
        /* default translation of the word*/
        mDefaultTranslation = defaultTranslation;
        /* japaneese translation of the word*/
        mJapaneeseTranslation = japaneeseTranslation;

        mAudioResourceID = audioResourceId;
    }

    public Word(String defaultTranslation,String japaneeseTranslation,int ImageResourceID,int audioResourceId){
        /* default translation of the word*/
        mDefaultTranslation = defaultTranslation;
        /* japaneese translation of the word*/
        mJapaneeseTranslation = japaneeseTranslation;
        /* Image's Resources ID */
        mImageResourceID = ImageResourceID;

        mAudioResourceID = audioResourceId;
    }


    /*
    * Get the default translation of the word
    */
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    /*
     Get the japaneese translation of the word
     */
    public String getJapaneeseTranslation(){
        return mJapaneeseTranslation;
    }

    /*
     * Get the Resource ID of the Image
     */
    public  int getImageResourceID(){ return mImageResourceID;}

    public boolean hasImage(){
        return mImageResourceID != 0;
    }

    public int getAudioResourceID(){ return mAudioResourceID;}
}
