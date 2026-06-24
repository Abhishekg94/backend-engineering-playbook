package com.engineering.playbook.miscellaneous;

import java.util.HashMap;
import java.util.Map;

public class FlattenJson {

    public static void main(String[] args) {
        Map<String, Object> input = new HashMap<>();

        Map<String, Object> d = new HashMap<>();
        d.put("e", 3);

        Map<String, Object> b = new HashMap<>();
        b.put("c", 2);
        b.put("d", d);

        input.put("a", 1);
        input.put("b", b);

        Map<String, Object> result = new HashMap<>();
        flattenJson(input, "", result);
        System.out.println(result);
    }

    static void flattenJson(Map<String, Object> map, String parent, Map<String, Object> result) {
        for(Map.Entry<String, Object> entry: map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            String newKey = parent.isEmpty()?key: parent+"."+key;

            if(value instanceof Map) {
                flattenJson((Map<String, Object>) value, newKey, result);
            } else {
                result.put(newKey, value);
            }
        }
    }

}
