package com.company;

public class TextWrittenBook extends Books {

    //////////////////////////////Attribute//////////////////////////////////////////
    private String genre;
    private String colour;
    private int loanDuration;
    private int numberOfStock;

    public TextWrittenBook(String title){
        super(title);
    }

    //////////////////////////////Constructors//////////////////////////////////////
    public TextWrittenBook(String title,String genre, String colour, int loanDuration, int numberOfStock){
        super(title);
        this.genre=genre;
        this.colour=colour;
        this.loanDuration=loanDuration;
        this.numberOfStock=numberOfStock;

    }

    public String getTitle() {
        System.out.println("Here is " + "Title");
        return null;
    }

    //////////////////////////////Methods//////////////////////////////////////////
    public void name(String title){
        System.out.println();
    }


    public int getLoanDuration() {
        return loanDuration;
    }

    public void setLoanDuration(int loanDuration) {
        this.loanDuration = loanDuration;
    }

    public int getNumberOfStock() {
        return numberOfStock;
    }

    public void setNumberOfStock(int numberOfStock) {
        this.numberOfStock = numberOfStock;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
