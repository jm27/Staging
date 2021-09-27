public class SwapNumbers {

    public static void main(String ...args){
    Swap(5,4);
    }

    public static void Swap(int numOne, int numTwo){
        System.out.println("Before - First Number: " + numOne + " Second Number: " + numTwo);
            numOne = numOne + numTwo; // Add both numbers
            numTwo = numOne - numTwo; // Subtract from result num two
            numOne = numOne - numTwo; // subtract from result new num two
        System.out.println("After - First Number: " + numOne + " Second Number: " + numTwo);
    }
}
