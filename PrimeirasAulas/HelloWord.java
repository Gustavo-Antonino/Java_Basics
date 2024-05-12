package PrimeirasAulas;

public class HelloWord{

    public static void main(String[] args) {
       
        // valores (int, double, float, string, long, e existe outros na documentação do java)
        int dadoDoTipoInt = 10; 
        double dadoDoTipoDouble = 3.14;
        float dadoDoTipoFloat = 3.14f;
        long dadoDoTipoLong = 800002021000L;
        String dadoDoTipoString = "OLA";
        boolean dadoDoTipoBoolean = true;

        // if/else
        if(dadoDoTipoInt == 10){
            System.out.println("Entrou dentro do if do 10!");
        } else if(dadoDoTipoInt < 12){
            System.out.println("Entrou no if do 12");
        }
        else{
            System.out.println("Entrou no ELSE!");
        }

        // while (enquanto algo for verdadeiro, faça alguma coisa
        int valorInicial = 0;
        while(valorInicial < 3){
            System.out.println("O valro inicial é menor que 3");
            System.out.println(valorInicial);
            valorInicial++; // valorInicial vai rodar 3 vezes

        }
        System.out.println("Saiu do");

        // For
        for(int i =0; i<4; i++){
            System.out.println("O valor do i é: " + i);
        }
        System.out.println("Finalizando o FOR");

        // o while e o for vão rodar ate que a condição se torne verdade, Portanto, você 
        // pode dizer que o loop “roda até que a condição se torne verdade”, no sentido de que o 
        // loop continua executando até que a 
        // condição especificada seja atendida. Muito bem observado!
    }
}

