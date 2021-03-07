package com.Inar;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JsonHashMasp {
    private HashMap<String, Object> map;

    public HashMap getJsonAsHashMap() throws IOException {
        DataDrivenArray data = new DataDrivenArray();
        String[] arr = data.getTestCaseInfo("login", "mixed");
        map = new HashMap<>();
        map.put("TestName", arr[0]);
        map.put("isbn", "isbn0123-3-593-4");
        map.put("aisle", arr[1]);
        map.put("name", arr[2]);
        Map<String, Object> map2 = new HashMap<>();
        map2.put("lat", -38.23423);
        map2.put("lng", -33.234234);
        map.put("location", map2);


        return map;
    }

}
