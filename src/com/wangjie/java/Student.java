package com.wangjie.java;

import java.util.ArrayList;

public class Student extends Person {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("args = [" + args + "]");

        System.out.println("Student.main");
        int num1 = 10;
        System.out.println("num1 = " + num1);
        System.out.println(num1);
        String[] strings = new String[]{"lili","liuhao","hanmeimei"};
        for (int i = 0; i <strings.length ; i++) {
            System.out.println(strings[i]);
        }
        for (String string : strings) {
            System.out.println(string);
        }
        for (int i = 0; i < strings.length; i++) {
            String string = strings[i];
            
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        for (Object o : arrayList) {
            
        }
        for (int i = 0; i < arrayList.size(); i++) {
            
        }
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            
        }
    }

}
