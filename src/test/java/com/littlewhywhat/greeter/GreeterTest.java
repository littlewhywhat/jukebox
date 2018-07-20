package com.littlewhywhat.greeter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GreeterTest {
  @Test public void testGreet() {
      Greeter greeter = new Greeter("me");
      assertEquals("Hello, me!", greeter.greet());
  }
}
