package PrimeirasAulas;
import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    public static void main(String[] args) {
        
        //Lista 
        List<String> nomes = new ArrayList<>();
        nomes.add("Gustavo");
        nomes.add("Antonino");
        nomes.add("Diogo");
        nomes.add("Boiola");

        //System.out.println(nomes.get(2));
        //for(String nome : nomes){
        //    System.out.println("O nome é " + nome);
        //}

        //nomes.forEach(nome -> System.out.println("O nome que apareceu foi " + nome));
        // OU para mais só para printar os resultados:
        nomes.forEach(System.out::println);
    }
    
}
