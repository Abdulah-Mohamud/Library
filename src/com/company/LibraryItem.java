package com.company;

public abstract class LibraryItem {

    //////////////////////////////Attribute//////////////////////////////////////////
    private String title;
    private int length;
    private String genre;


    //////////////////////////////Constructors///////////////////////////////////////
        public LibraryItem(String title){
            this.title = title;
        }

    //////////////////////////////Methods//////////////////////////////////////////
    public String getTitle(){
       // System.out.println("The title is "+title +" ");
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length){
        this.length = length;
    }

    public String getGenre(){
        return genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }
}
