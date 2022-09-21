package exercicio019;

import java.util.ArrayList;

public class WeightList {
    public static void main(String[] args) {
        ArrayList<Float> wight = new ArrayList<>();

        wight.add(123.45f);
        wight.add(100.56f);
        wight.add(98.76f);

        int pocisao = 0;
        float peso = wight.get(0);

        for(int i = 1; i < wight.toArray().length; i++) {
            if(peso > wight.get(i)) {
                peso = wight.get(i);
                pocisao = i;
            }

        }
        System.out.println(pocisao);
    }
}
