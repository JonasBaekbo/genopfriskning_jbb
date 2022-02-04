package com.company;

import java.util.Arrays;
import java.util.Objects;

public class Søgning {

    public int søg(String[] arr, String tekst) throws Exception {
        int len = arr.length;
        int i = 0;

        while (i < len) {
            if (arr[i] == tekst) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        fail();
        return -1; // Unreachable, men skal være der


    }
    private void fail() throws Exception {
        throw new Exception("Strengen blev ikke fundet");
    }
}
