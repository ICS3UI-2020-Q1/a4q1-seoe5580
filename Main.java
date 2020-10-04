import java.util.Scanner;
/**
 * Count down by 5 until the user's integer
 * @author Eric Seo
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creates a scanner for user input
    Scanner input = new Scanner(System.in);

    // Asks the user to enter a integer
    System.out.println("Please enter an integer to count down to");
    
    // Gets the number from the user
    int numDown = input.nextInt();
    
    // declares a vaule for the variable count
    int count = 100;

    // Calculates the outcomes
    while(count >= numDown){
      System.out.print(count);
      count = count - 5;
    }
    // I dont get why Im getting the out comes all in one line
  }
}
