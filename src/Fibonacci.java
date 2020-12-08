public class Fibonacci {

    public static int fibonacci(int n){

        //Create an array to stores all calculated values, avoids calculating the same values multiple times.
        int[] calculated = new int[n + 1];

        return fibonacciRecursive(n, calculated);
    }

    private static int fibonacciRecursive(int n, int[] calculated){

        if(calculated[n] != 0) {
            //Value previously calculated
            return calculated[n];
        } else if(n == 0) {
            //Base case F0 = 0
            return 0;
        } else if(n == 1) {
            //Base case F1 = 1
            return 1;
        } else {
            //Recursive step, save this value and return it.
            calculated[n] = fibonacciRecursive(n - 1, calculated) + fibonacciRecursive(n - 2, calculated);
            return calculated[n];
        }
    }

}
