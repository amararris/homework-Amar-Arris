package fibonacci;

public class Fabonacci {

    // Function to print N Fibonacci Number
    static void Fibonacci(int N)
    {
        int num1 = 0, num2 = 1;

        int count = 0;


        while (count < N) {

            // Print the number
            System.out.print(num1 + " ");


            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            count = count + 1;
        }
    }


    public static void main(String args[])
    {
        // Given Number N
        int N = 40;

        // Function Call
        Fibonacci(N);
    }
}


