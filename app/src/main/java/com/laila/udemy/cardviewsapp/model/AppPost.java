package com.laila.udemy.cardviewsapp.model;

public class AppPost {

     private String name, postDate, subtitle;
     private int postImage;

     public AppPost() {}

     public AppPost(String name, String postDate, String subtitle, int postImage) {
         this.name = name;
         this.postDate = postDate;
         this.subtitle = subtitle;
         this.postImage = postImage;
     }

     //region Getters and Setters
    public String getName() {
         return this.name;
    }

    public void setName(String newName) {
         this.name = newName;
    }

    public String getPostDate() {
         return this.postDate;
    }

    public void setPostDate (String newDate) {
         this.postDate = newDate;
    }

    public String getSubtitle() {
         return this.subtitle;
    }

    public void setSubtitle(String newSub) {
         this.subtitle = newSub;
    }

    public int getPostImage() {
         return this.postImage;
    }

    public void setPostImage(int newImage) {
         this.postImage = newImage;
    }

    //endregion
}
