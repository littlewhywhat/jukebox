package com.littlewhywhat.greeter;

/**
 * I am a Greeter. I can greet whom
 *
 * @author littlewhywhat
 *
 */
public class Greeter {
  /**
   * myWhom to greet
   */
  private String myWhom;
  /**
   * Constructs me to greet whom
   */
  public Greeter(String whom) {
    myWhom = whom;
  }

  /**
   * Greets myWhom
   * @return      greeting
   */
  public String greet() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Hello, ");
    stringBuilder.append(myWhom);
    stringBuilder.append("!");
    return stringBuilder.toString();
  }
}