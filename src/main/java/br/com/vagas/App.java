package br.com.vagas;

import br.com.vagas.Fibonacci;
import java.util.Scanner; 

public class App{

  public static void main(String[] args){
    Fibonacci fibonacci = new Fibonacci();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Bem vindo a calculadora de Fibonacci!");

    while(true){
      System.out.println("Digite a posição do termo que desejas encontrar! ");
      int index = scanner.nextInt();      
      try {
        System.out.println("O valor da posição \"" + index + 
          "\" é \"" + fibonacci.calculateTerm(index) + "\".");
      }catch(RuntimeException e){
        System.out.println(e.getMessage());
      }

      System.out.println("Digite crtl+c para sair!");
    }
  }
}
