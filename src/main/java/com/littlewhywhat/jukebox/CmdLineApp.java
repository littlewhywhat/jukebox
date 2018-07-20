package com.littlewhywhat.jukebox;

import com.littlewhywhat.greeter.Greeter;

/**
 * I am a CmdLineApp for jukebox
 *
 * @author littlewhywhat
 *
 */
public class CmdLineApp {
  /**
   * Runs me
   */
  public void run()
  {
    Greeter greeter = new Greeter("me");
    System.out.println(greeter.greet());
  }
  /**
   * Command line entry point
   * @param args command line arguments
   */
  public static void main(String[] args)
  {
    CmdLineApp app = new CmdLineApp();
    app.run();
  }
}