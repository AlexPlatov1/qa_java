package com.example;

import java.util.Arrays;
import java.util.List;

public class LionAlex extends Lion{

    public static final String PLACE_OF_LIVING = "Нью-Йоркский зоопарк";
    public static final List<String> FRIENDS = Arrays.asList("Марти", "Глория", "Мелман");

    public LionAlex(Feline feline, String sex) throws Exception {
        super(feline, "Самец");
    }

    @Override
    public int getKittens() {
        return 0;
    }

    public List<String> getFriends() {
        return FRIENDS;
    }

    public String getPlaceOfLiving() {
        return PLACE_OF_LIVING;
    }
}
