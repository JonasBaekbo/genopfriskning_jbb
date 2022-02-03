package com.company;

public class Kvadrat {
    public void kva(int nummer, char tegn){
        String write = "";
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < nummer; i++) {
            for (int j = 0; j< nummer; j++){
                System.out.print(tegn + "  ");
            }
            System.out.println();
        }
    }
}
