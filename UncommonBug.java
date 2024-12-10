public class UncommonBug {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            System.out.println(arr[5]); // This line might throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
            // Handle the exception gracefully.  This is a common error, but often poorly handled.
        } finally {
            System.out.println("Finally block executed");
        }
        System.out.println("Program continues");
    }
}