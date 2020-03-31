import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StubProgram2 {
  
  /**
  * StubProgram uses MrCoxallStack.
  */

  public static void main(String[] args) {
    // program lets users add items to the MrCoxallStack
    MrCoxallStack2 anStack = new MrCoxallStack2();
    String anItem;

    InputStreamReader r = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(r);

    Scanner input = new Scanner(System.in);
        
    for (int lockNumber = 0; lockNumber < 3; lockNumber++) {
      System.out.println("Enter an item to the stack");
      try {
        anItem = br.readLine();
        anStack.push(anItem);
      
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        
      }
      
    }
    
    for (int lockNumber = 0; lockNumber < 3; lockNumber++) {
      System.out.println("Click enter to remove an it");
      try {
        anItem = br.readLine();
        System.out.println("You just took off " + anStack.pop());
        
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        
      }
    }
  }
}