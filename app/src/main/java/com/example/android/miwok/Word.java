package com.example.android.miwok;

import android.content.Context;

public class Word {

    private String mTextDefault;
    private String mTextMiwok;
    private Context mContext;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word (String TextMiwok, String TextDefault, int AudioResourceId) {
        mTextDefault = TextDefault;
        mTextMiwok = TextMiwok;
        mAudioResourceId = AudioResourceId;
    }
    public Word (String TextMiwok, String TextDefault, int ImageResourceId, int AudioResourceId) {
        mTextDefault = TextDefault;
        mTextMiwok = TextMiwok;
        mImageResourceId = ImageResourceId;
        mAudioResourceId = AudioResourceId;
    }

    public String getDefaultTranslation() {
        return mTextDefault;
    }
    public String getMiwokTranslation() {
        return mTextMiwok;
    }
    public int getImageResourceId() { return mImageResourceId; }
    public boolean hasImage() {return mImageResourceId != NO_IMAGE_PROVIDED; }
    public int getAudioResourceId() {return mAudioResourceId;}

    @Override
    public String toString() {
        return "Word{" +
                "mTextDefault='" + mTextDefault + '\'' +
                ", mTextMiwok='" + mTextMiwok + '\'' +
                ", mContext=" + mContext +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
