package com.example.testing;

import java.util.logging.Logger;

public class App {
  private static final Logger logger = Logger.getLogger(
      App.class.getName());

  public static void main(String[] args) {
    logger.info("Hello World!");
  }

  public static int sum(int a, int b) {
    return a + b;
  }

  public static int subtract(int a, int b) {
    return a - b;
  }
}
