package com.company;

public class Hardback extends Books {
    //////////////////////////////Attribute//////////////////////////////////////////

    private String colour;
    private int loanDuration;
    private int numberOfStock;

    public Hardback(String title){
        super(title);
    }

    //////////////////////////////Constructors//////////////////////////////////////
    public Hardback(String title,String colour,int loanDuration, int numberOfStock){
        super(title);
        this.colour=colour;
        this.loanDuration=loanDuration;
        this.numberOfStock=numberOfStock;


    }

   //public Hardback(String title, String colour, int loanDuration, int numberOfStock){
     //   this("batman","Black",2 ,13 );
    //}

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
