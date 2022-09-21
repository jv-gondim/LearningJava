package exercicio018;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeLists {
    public static void main(String[] args) {
        ArrayList<String> nameListOne = new ArrayList<>();
        ArrayList<String> nameListTwo = new ArrayList<>();

        nameListOne.add("Alberto");
        nameListOne.add("Beto");
        nameListTwo.add("Rose");
        nameListTwo.add("Carla");

        for(int i = 0; i < nameListTwo.toArray().length; i++) {
            nameListOne.add(nameListTwo.get(i));
        }

        var t = nameListOne.toArray(String[]::new);
        Arrays.sort(t);

        for (int i = 0; i < t.length; i++) {
            System.out.println(t[i]);
        }
    }
}
