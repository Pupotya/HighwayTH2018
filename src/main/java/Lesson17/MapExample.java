package Lesson17;

import org.testng.annotations.Test;

import java.util.*;

public class MapExample {

    @Test
    public void mapFor(){
        Map<String, Double> map = new HashMap<>();

        map.put("StarWars1", 8.3);
        map.put("StarWars2", 9.1);
        map.put("StarWars3", 5.7);
        Set<Map.Entry<String,Double>>entries = map.entrySet();
        for(Map.Entry<String,Double> entry : entries){
            String key= entry.getKey();
            Double value = entry.getValue();
            System.out.println("Movie Title: "+key+" Rating: "+ value);
        }
    }

    @Test
    public void listIterator(){
        List<String> sexNames = new ArrayList<>();
        sexNames.add("Slava");
        sexNames.add("Jack");
        sexNames.add("Kolya");
        sexNames.add("Jessika");


    }





}
