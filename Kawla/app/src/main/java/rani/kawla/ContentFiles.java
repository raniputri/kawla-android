package rani.kawla;

/**
 * Created by ACER on 11/16/2017.
 */

public class ContentFiles {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOffiles() {
        return numOffiles;
    }

    public void setNumOffiles(int numOffiles) {
        this.numOffiles = numOffiles;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    private int numOffiles;
    private int thumbnail;

    public ContentFiles() {
    }


    }

