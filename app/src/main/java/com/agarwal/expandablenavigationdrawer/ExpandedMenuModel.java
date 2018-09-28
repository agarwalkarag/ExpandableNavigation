package com.agarwal.expandablenavigationdrawer;

import android.graphics.drawable.Drawable;

public class ExpandedMenuModel {

    String iconName = "";
    int iconImg = -1; // menu icon resource id
   int indicator = -1;

    public int getIndicator() {
        return indicator;
    }

    public void setIndicator(int indicator) {
        this.indicator = indicator;
    }

    public String getIconName() {
        return iconName;
    }
    public void setIconName(String iconName) {
        this.iconName = iconName;
    }
    public int getIconImg() {
        return iconImg;
    }
    public void setIconImg(int iconImg) {
        this.iconImg = iconImg;
    }
}
