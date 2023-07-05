package Javabase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListVero {



        public static void main(String[] args) {

        //  Stringarr[] a= new java.lang.String[]{ "rome", "londra", "C", "D" };


//lista non mutabile=array
        //lista mutabile = arraylist


        List<String> cityNames = Arrays.asList("rome", "londra", "Chieri");
        // List<String> cityNames =new ArrayList<>();


//cityNames.add("torino");

        // cityNames.get(0);
//cityNames.add("torino");


        cityNames.set(1,"Tegucigalpa");

        System.out.println(cityNames);


        System.out.println(cityNames.get(2));


//Tegucigalpa

        System.out.println("non si puo agg nulla perche e una lista immutabile");


        List<String> re= new ArrayList<>();
        re.add("ruo");
        re.add("tito");
        re.add("ruo");
        re.add("tito");
        re.add("ruo");
        re.add("tito");
        re.add("ruo");


        System.out.println(re);

        //conversione da arraylist a arr

        List<String> res= Arrays.asList();

    }



    }

