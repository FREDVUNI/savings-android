package com.earlcommunications.savings;

/**
 * Created by user on 1/11/2020.
 */

public class Screenitem {
    String Title,Description;
    int screenImg;

    public Screenitem(String title, String description, int screenImg) {
        Title = title;
        Description = description;
        this.screenImg = screenImg;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setScreenimg(int screenImg) {
        this.screenImg = screenImg;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }

    public int getScreenimg() {
        return screenImg;
    }
}
