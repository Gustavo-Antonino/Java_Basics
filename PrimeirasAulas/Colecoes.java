package PrimeirasAulas;
import java.util.HashMap;
import java.util.Map;

public class Colecoes {
    public static void main(String[] args) {
        
        //Map e HashMap
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Gustavo", 10);
        notas.put("Vini", 10);
        notas.put("Elias", 9);

        var nota = notas.get("Gustavo");
        System.out.println(nota);

        for(Map.Entry<String, Integer> entry : notas.entrySet()){
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("A chave é " + key + "e o valor é " + value);
        }

    }
}
