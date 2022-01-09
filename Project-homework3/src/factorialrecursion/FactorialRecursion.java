package factorialrecursion;

import java.util.Scanner;

public class FactorialRecursion {

    public static void main(String args[]) {
        int n;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");

        int num = sc.nextInt();
        //Called the user defined function fact
        int factorial = fact(num);
        System.out.println("Factorial of entered number is: " + factorial);
    }

    static int fact(int n) {
        int i;
        if (n == 1) {
            return 1;
        }
        //Recursion: Function calling itself!!
        i = fact(n - 1) * n;
        return i;
    }
}
