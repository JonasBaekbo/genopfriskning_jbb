package com.company;

import java.time.Year;

public class Bog {
    private int ISBN;
    private String title;
    private Year releaseYear;

    public Bog(int ISBN, String title, Year releaseYear) {
        this.ISBN = ISBN;
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Year getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Year releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "{Bogens titel: " + title + "\nBogens ISBN-nummer: " + ISBN + "\nBogens udgivelsesår: " + releaseYear + '}';
    }
}
