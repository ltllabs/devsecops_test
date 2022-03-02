package com.example.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

  @Test
  public void sumShouldAddTheOperands() {
    int a = 9;
    int b = 12;
    int c = a + b;

    assertEquals(c, App.sum(a, b));
  }

  @Test
  public void subtractShouldSubtractTheOperands() {
    int a = 9;
    int b = 12;
    int c = a - b;

    assertEquals(c, App.subtract(a, b));
  }
}
