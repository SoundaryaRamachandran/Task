package com.example.demo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class exmap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        {
            map.put(1, 18);
            map.put(2, 45);
            map.put(3, 8);
            map.put(4, 8);
            map.put(5, 6);
            int maxValueInMap = (Collections.max(map.values()));
            int minValueInMap=(Collections.min(map.values()));
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

                if (entry.getValue() == maxValueInMap) {


                    System.out.println(entry.getKey());

                }
                if(entry.getValue()==minValueInMap){
                    System.out.println(entry.getKey());
                }
            }
        }
    }
}
