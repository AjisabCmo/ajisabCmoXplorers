package MyOwnExercise;

import java.util.ArrayList;

public class AddingElementToArrayList {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("goat");
        animals.add("chicken");
        animals.add("monkey");
        System.out.println(animals);

        animals.add(3,"butterfly");
        System.out.println(animals);

}
    }

