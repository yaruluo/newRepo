/******************************************
 * File name:     Greeter.java
 * Compilation:   javac Greeter.java
 * Execution:     java Greeter
 *
 * Parameter-ized to greet a particular person
******************************************/

public class Greeter {

  /* It is not legal to put the greet method before the
  main method since it is called in the main method */

  public static void main( String[] commandLine){ //String is a class
    greet( "Professor Kernighan");
    greet( "Admiral Hopper");
    greet( "Good-time Johnny");
    greet( "Yaruuuu");
    // It is invalid to nest methods inside of another
  }
  public static void greet(String person) {
    System.out.println( "hello, "  //System is a class
                      + person
                      + "! How you doon?");
  }
}

  /* It is not legal to put the greet method outside the
  Greeter class */
