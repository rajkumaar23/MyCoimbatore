package io.github.rajkumaar23.mycoimbatore;

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private String mDesc;
    private String mUrl;
    private int mResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
    public Word(String miwokTranslation, String defaultTranslation,String url,int resourceId,String desc) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mDesc=desc;
        mResourceId=resourceId;
        mUrl=url;

    }
    public Word(String miwokTranslation, String defaultTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;

    }



    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public String getDescription(){
        return mDesc;
    }

    public int getResourceId()
    {
        return mResourceId;
    }

    public String getmUrl() {
        return mUrl;}

    public boolean hasImage(){
        if(mResourceId==NO_IMAGE_PROVIDED)
            return false;
        else
            return true;
    }
}
