import java.util.logging.Level;
import java.util.logging.Logger;

public class UncommonBugSolution {
    private static final Logger logger = Logger.getLogger(UncommonBugSolution.class.getName());

    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            System.out.println(arr[5]); // This line might throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.log(Level.SEVERE, "ArrayIndexOutOfBoundsException caught: " + e.getMessage() + ", index: " + e.getMessage().substring(e.getMessage().indexOf("[") + 1, e.getMessage().indexOf("]")), e);
            //Improved logging and error handling. This demonstrates a better approach than just catching and printing. More robust recovery strategies might be needed based on context
        } finally {
            System.out.println("Finally block executed");
        }
        System.out.println("Program continues");
    }
}