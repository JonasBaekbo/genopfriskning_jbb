package com.company;

public class Græs {
    double dageTilSlåning(double højde, double maxHøjde){
        double dage = 0;
        for (int i = 0; i <= maxHøjde; i++) {
            højde = højde+0.8;
            dage++;

        }
        return dage;
    }
}
