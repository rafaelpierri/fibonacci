package br.com.vagas;

import org.junit.Test;
import org.junit.Assert;
import br.com.vagas.Fibonacci;

public class FibonacciTest {

  Fibonacci fibonacci = new Fibonacci();

  @Test(expected=RuntimeException.class)
  public void test0thTerm() {
    fibonacci.calculateTerm(0);
  }

  @Test
  public void test1stTermEquals1() {
    Assert.assertEquals(fibonacci.calculateTerm(1), 1);
  }

  @Test
  public void test2ndTermEquals1() {
    Assert.assertEquals(fibonacci.calculateTerm(2), 1);
  }

  @Test
  public void test6thTermEquals8() {
    Assert.assertEquals(fibonacci.calculateTerm(6), 8);
  }
}
