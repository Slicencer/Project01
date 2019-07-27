package com.wangjie.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public abstract class HelloWorld {
    //region Description
    private static final int INITIALIZE =10;
    private static int one;

    public static void main(String[] args) {
        one= 10;
        System.out.print("helloworld");
        System.out.print("helloworld");
        Date date = new Date();

        ArrayList list = new ArrayList();
//        list.add(4,122);

    }
    //endregion

    public static int getINITIALIZE() {
        return INITIALIZE;
    }

    public static void main1(){


        try {
            FileInputStream fileInputStream =  new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}


