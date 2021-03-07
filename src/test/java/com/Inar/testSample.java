package com.Inar;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class testSample {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub


        DataDrivenArrayList d = new DataDrivenArrayList();
        ArrayList<String> arrayList = d.getData("add profile", "mixed");


        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.get(3));


        DataDrivenArray array = new DataDrivenArray();
        String[] arr = array.getTestCaseInfo("add profile", "mixed");
        System.out.println(arr);
        array.displayTestCaseInfo(arr);


        JsonHashMasp jsHashMap = new JsonHashMasp();
        Map<String, Object> map = jsHashMap.getJsonAsHashMap();
        System.out.println("===========================");
        System.out.println(map.get("TestName"));
        System.out.println(map.get("location"));


    }

}
