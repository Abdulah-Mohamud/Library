package com.company;

import static org.junit.Assert.assertEquals;
import com.company.TextWrittenBook;
import com.company.BrailleBook;
import org.junit.Test;
import org.w3c.dom.ls.LSOutput;


public class MainTest {

    @Test
    public void SearchTest() {
        Books titleTest = new Books("Batman");
        assertEquals("The book was not found","Batman",titleTest.getTitle());
        //Books genreTest = new Books("Crime fighting");
        //assertEquals("The genre was not found","Crime fighting",MainTest.getGenre());

    }

}