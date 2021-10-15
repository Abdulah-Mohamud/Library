package com.company;

public class Books extends LibraryItem{
    //////////////////////////////Attribute//////////////////////////////////////////
    private int length;
    private String title;


    //////////////////////////////Constructors///////////////////////////////////////
    public Books(String title) {
        super (title);
    }

    //////////////////////////////Method////////////////////////////////////////////

    public Books title() throws Exception {
        System.out.println("The title of what you are looking for is " + "title");
        return new Books(title);
    }

    public void length(int length){
        System.out.println("The average read of this book is" + "length");
    }
}
