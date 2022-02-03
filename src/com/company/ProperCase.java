package com.company;

import java.util.Locale;

public class ProperCase {
public void change(String toChange){
    String[] arrOfStr = toChange.split(" ");
    String changed = "";


    for (String a : arrOfStr){
        if (a.length() > 3 && !a.equals(a.toUpperCase())){
           a =a.substring(0,1).toUpperCase() + a.substring(1).toLowerCase();
            ;
        }else if (a.length() <= 3 && !a.equals(a.toUpperCase())){
            a = a.toLowerCase();
        }
        changed += a + " ";
    }
    System.out.println(changed);
    }

}
