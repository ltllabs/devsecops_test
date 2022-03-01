package com.example.testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
  /**
   * Rigorous Test :-)
   */
  @Test
  public void shouldAnswerWithTrue() {
    int a = 9;
    int b = 12;
    int c = a + b;

    assertEquals(c, App.sum(a, b));
  }
}
