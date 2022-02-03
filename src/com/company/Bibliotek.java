package com.company;

import java.time.Year;
import java.util.ArrayList;

public class Bibliotek {
    public static ArrayList<Bog> bib = new ArrayList<>();

    public Bibliotek() {
        Bog b1 = new Bog(1234,"test", Year.of(2022));
        Bog b2 = new Bog(12345,"test2", Year.of(2011));
        Bog b3 = new Bog(123456,"test3", Year.of(2015));
        bib.add(b1);
        bib.add(b2);
        bib.add(b3);
    }

    static boolean checkISBN(Bog bookToCheck) {
        boolean checkedBook = false;
        for (Bog bog : bib) {
            if (bookToCheck.getISBN() == bog.getISBN()) {
                checkedBook = true;
            } else {
                checkedBook = false;
            }
        }
        return checkedBook;
    }
}

