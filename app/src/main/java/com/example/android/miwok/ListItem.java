package com.example.android.miwok;

public class ListItem {

    private String mListItem;
    private String mListItemDescription;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public ListItem(String listItemDescription, String listItem) {
        mListItemDescription = listItemDescription;
        mListItem = listItem;
    }


    public ListItem(String listItemDescription, String listItem, int imageResourceId) {
        mListItemDescription = listItemDescription;
        mListItem = listItem;
        mImageResourceId = imageResourceId;
    }


    public String getmListItem (){
        return mListItem;
    }

    public String getmListItemDescription (){
        return mListItemDescription;
    }

    public int getImageResourceId (){
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
