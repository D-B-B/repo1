package com.itheima;


import java.io.*;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Test{


    public static void main(String[] args) throws IOException {


        int[] arr = {1,1,2,2,2,3};

        int[] num = new int[124];

        for (int i = 0; i < arr.length; i++) {
            num[arr[i]]++;
        }

        for (int j = 0; j < num.length; j++) {
            if (num[j] != 0){
                System.out.println(j+"出现了"+num[j]+"次");
            }
        }

        System.out.println(3*0.1 == 0.3);

        System.out.println("hello,word");

    }
}
