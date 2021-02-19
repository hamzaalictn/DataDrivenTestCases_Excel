package com.Inar;

import java.io.IOException;
import java.util.ArrayList;

public class testSample {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub


        DataDrivenArrayList d = new DataDrivenArrayList();
        ArrayList<String> arrayList = d.getData("add profile","mixed");
        System.out.println(arrayList);
        System.out.println("----------------------------");

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(3));

        System.out.println("----------------------------");

        DataDrivenArray a = new DataDrivenArray();
        String[] arr = a.getTestCaseInfo("add profile","mixed");
        a.displayTestCaseInfo(arr);

        System.out.println("----------------------------");



    }

}
