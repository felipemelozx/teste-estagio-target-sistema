
/*
Escreva um programa que verifique, em uma string, a existência da letra ‘a’,
seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.
*/


import java.util.Scanner;

public class question2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Informe sua string por favor.");

    StringBuffer st = new StringBuffer(scan.nextLine());

    int count = 0;

    for(int i = 0; i < st.length(); i++){
      if(st.charAt(i) == 'a' || st.charAt(i) == 'A' ){
        count++;
      }
    }
    if (count == 0){
      System.out.println("Não contem a letra A ou a na sua string.");
      return;
    }
    System.out.println("Na sua string contem " + count + " letras A ou a.");
  }
}
