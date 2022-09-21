package novi.basics;

import java.util.ArrayList;
import java.util.HashMap;

public class Translator {
    HashMap<Integer, String> numericAlpha = new HashMap<Integer, String>();

    public Translator(ArrayList<String> alphabetic, ArrayList<Integer> numeric) {
        for (int i = 0; i < numeric.size(); i++) {
            numericAlpha.put(numeric.get(i), alphabetic.get(i));
            //System.out.println(numericAlpha.get(i+1));
        }
    }

    public String translate(Integer number){

        return "dit is het nummer " + numericAlpha.get(number);
    }
    // extra comment

}
