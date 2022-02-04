package com.company;

import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        /*ArrayList myList = new ArrayList();
        String tekst = "Hej";
        myList.add(tekst);

        System.out.println(doesArraylistContainString(myList, "Hej"));
        System.out.println();*/
        /*Bibliotek bib = new Bibliotek();
        Bog b4 =new Bog(1234546,"test4", Year.of(2017));
        System.out.println(bib.checkISBN(b4));*/

       /* Græs græs = new Græs();
        Scanner sc = new Scanner(System.in);
        System.out.println("Hvor højt er dit græs i CM?");
        double højde = sc.nextDouble();
        System.out.println("Hvor højt må græs maximalt være i CM?");
        double maxHøjde = sc.nextDouble();

        System.out.println("Du skal slå dit græs om " + græs.dageTilSlåning(højde,maxHøjde) + " dage");*/

        /*Kvadrat kva = new Kvadrat();
        kva.kva(5, 'G');*/

        /*ProperCase pc = new ProperCase();
        pc.change("Hvordan GÅR det med dig min gOde VENNER");*/

        /*Scanner sc = new Scanner(System.in);
        String[] ord = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("indtast et ord:");
        ord[i] = sc.next();
        }
        Arrays.sort(ord, Collections.reverseOrder());
        System.out.println(Arrays.toString(ord));*/

        Søgning søg = new Søgning();
        String[] arr = new String[3];
        arr[0] = "Hej";
        arr[1] = "Med";
        arr[2] = "Dig";
        System.out.println(søg.søg(arr, "Digd"));
    }
    /*public static boolean doesArraylistContainString(ArrayList list, String streng){

        if (list.contains(streng)){
            System.out.println("the String has been found");
            return true;
        }else{
            return false;
        }


    */
    }

