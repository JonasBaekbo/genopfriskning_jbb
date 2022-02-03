package com.company;

public class Søgning {

    public int søg(String[] arr, String tekst){
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(tekst)){
                index = i;
            }else{
               // index = -1;
                throw new RuntimeException("Strengen findes ikke i arrayet");
            }
        }
        return index;
    }
}
