import java.util.LinkedHashMap;
import java.util.Map;

class Solution {

    public int romanToInt(String s) {

        Map<String, Integer> numerosRomanos = new LinkedHashMap<>();
        numerosRomanos.put("I", 1);
        numerosRomanos.put("V", 5);
        numerosRomanos.put("X", 10);
        numerosRomanos.put("L", 50);
        numerosRomanos.put("C", 100);
        numerosRomanos.put("D", 500);
        numerosRomanos.put("M", 1000);

        String[] numerosArray = s.split("");

        int valor;
        int ant = 0;
        int total = 0;

        for (int i = s.length()-1; i >= 0; i--){

            valor = numerosRomanos.get(numerosArray[i]);

            if (valor >= ant){

                total += valor;

            }
            else{
                total -= valor;
            }

            ant = valor;

        }

        return total;
    }

    public static void main(String[] args){

        Solution solution = new Solution();

        System.out.println(solution.romanToInt("MCMXCIVV"));


    }



}
