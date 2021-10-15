package com.company;

public class Main {

    public static void main(String[] args) {
	    Hardback hardback1 = new Hardback("Batman","Black",1,13);
        System.out.println(hardback1.getTitle());

        Paperback paperback1 = new Paperback("Flash","Red",2,34);
        System.out.println(paperback1.getTitle());
        
    }
}
