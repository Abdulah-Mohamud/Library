package com.company;

public class BrailleBook extends Books {
    //////////////////////////////Attribute//////////////////////////////////////////

    private String colour;
    private int loanDuration;
    private int numberOfStock;

    public BrailleBook(String title){
        super(title);
    }

    //////////////////////////////Constructors//////////////////////////////////////
    public BrailleBook(String title, String colour, int loanDuration, int numberOfStock){
        super(title);
        this.colour=colour;
        this.loanDuration=loanDuration;
        this.numberOfStock=numberOfStock;


    }

    public static String getTitle(String batman) {
        System.out.println("Here is " + "Title");

        return batman;
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