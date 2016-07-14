package br.com.vagas;

public class Fibonacci{

  /**
   * Retorna o valor de algum termo da série de Fibonacci.
   * https://en.wikipedia.org/wiki/Fibonacci_number
   *
   * @param index Indice do termo
   * @return Valor do termo solicitado 
   */
  public int calculateTerm(int index){
    if(index < 1){
      throw new RuntimeException("Indices devem ser maior que 1.");
    }
    if(index == 1 || index == 2){
      return 1;
    }else{
      return calculateTerm(index - 1) + calculateTerm(index - 2);
    }
  }

}
