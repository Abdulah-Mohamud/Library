package com.company;

public class Books extends LibraryItem{
    //////////////////////////////Attribute//////////////////////////////////////////
    private int averageRead;
    private String title;


    //////////////////////////////Constructors///////////////////////////////////////
    public Books(String title) {
        super (title);
        this.title = title;
    }

    //////////////////////////////Method////////////////////////////////////////////

    public Books title() throws Exception {
        System.out.println("The title of what you are looking for is " + "title");
        return new Books(title);
    }

    public void getaverageRead(int averageRead){
        System.out.println("The average read of this book is" + "averageRead");
    }

}
