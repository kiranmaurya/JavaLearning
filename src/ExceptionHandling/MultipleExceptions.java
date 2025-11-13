package ExceptionHandling;

public class MultipleExceptions {
    public static void main(String[] args) {
        try {
            int[] nums = {10, 20, 30};
            int div = nums[1] / 0; // ArithmeticException
            System.out.println(nums[5]); // ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("⚡ Other exception: " + e.getMessage());
        } finally {
            System.out.println("Program completed safely!");
        }
    }

}
