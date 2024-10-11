import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será asoma dos 2 valores anteriores
 (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),escreva um programa na linguagem que desejar onde, informado um número,
 ele calcule asequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
*/
public class question1 {
    public static void main (String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Digite um número que queira checar.");
      int numero = scan.nextInt();

      boolean verdade = pertence(numero);

      if (verdade || numero == 0){
        System.out.println("O número " + numero + " Pertence.");
      }else {
        System.out.println("O número " + numero + " não pertence.");
      }
    }

    public static boolean pertence (int numero){
    List<Integer> fibonacci = new ArrayList<>();
    fibonacci.add(0);
    fibonacci.add(1);

    int esquerda = 0;
    int direita = 1;

    boolean continua = true;
    while (continua){
      int soma = fibonacci.get(esquerda) + fibonacci.get(direita);
      fibonacci.add(soma);
      direita++;
      esquerda++;
      if(fibonacci.get(direita) == numero){
        continua = false;
        return true;
      }
      if (fibonacci.get(direita) > numero){
        continua = false;
        return false;
      }
    }
    return false;
  }
}

