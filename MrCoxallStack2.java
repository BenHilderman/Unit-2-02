import java.util.ArrayList;
import java.util.List;


public class MrCoxallStack2 {
  // This class implements a stack object

  // the stack will actually be held in a List
  private List theStackList = new ArrayList();
  
  /**
  * Push valueToPutOnStack.
  */
  
  public void push(String valueToPutOnStack) {
    // Push method adds an item to the stack
    theStackList.add(valueToPutOnStack);
    System.out.println(theStackList);
  
  }
  
  /**
  * Pop removes item from stack.
  */
  
  public String pop() {
    // Pop method removes an item to the stack

    int numberSize = theStackList.size();

    String topItem = (String)theStackList.get(numberSize - 1);
    theStackList.remove(numberSize - 1);
    System.out.println(theStackList);
  
    return topItem;
  }
}