package ChibuzorTask;

import java.util.Arrays;
import java.util.Scanner;

public enum GeoPoliticalZone {
    NORTHCENTRAL("benue", "fct", "kogi", "Kwara", "Nasarawa", "Niger", "plateau"),
    NORTHEAST("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe"),
    NORTHWEST("Kaduna", "Kano", "Katsina", "Kebbi", "Jigawa", "Sokoto ", "Zamfara"),
    SOUTHEAST("Abia", "Anambra", "Ebonyi", "Enugu", "Imo"),
    SOUTHSOUTH("Akwa Ibom", "Bayelsa", "Cross River", "Delta", "Edo", "Rivers"),
    SOUTHWEST("Ekiti", "Lagos", "Ogun", "Ondo", "Osun", "Oyo");

    private String[] states;


    public String[] getStates() {
        return states;
    }


    GeoPoliticalZone(String... states) {
        this.states = states;
    }

    public String[] state() {
        return this.states;
    }

    public static GeoPoliticalZone geopolitical(String states) {

        for (GeoPoliticalZone zone : GeoPoliticalZone.values())
            for (String state : zone.state()) {
                boolean isState = state.equalsIgnoreCase(states);
                if (isState) {
                    return zone;
                }
            }
        return null;


    }

}