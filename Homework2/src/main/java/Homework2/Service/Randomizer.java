package Homework2.Service;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Random;

public class Randomizer {

    private static final Map<Integer, String> randomTitle = Map.ofEntries(
            new AbstractMap.SimpleEntry<>(1, "T-shirt"),
            new AbstractMap.SimpleEntry<>(2, "shorts"),
            new AbstractMap.SimpleEntry<>(3, "boots"),
            new AbstractMap.SimpleEntry<>(4, "jacket"),
            new AbstractMap.SimpleEntry<>(5, "jeans"),
            new AbstractMap.SimpleEntry<>(6, "socks"),
            new AbstractMap.SimpleEntry<>(7, "gloves"),
            new AbstractMap.SimpleEntry<>(8, "pants"),
            new AbstractMap.SimpleEntry<>(9, "shirt"),
            new AbstractMap.SimpleEntry<>(10, "tie"),
            new AbstractMap.SimpleEntry<>(0, "briefs")
    );

    public static String getRandomTitle(){
        int r = new Random().nextInt(10);
        return randomTitle.get(r);
    }

    public static int getRandomCost(){
        return new Random().nextInt(500);
    }

}
