public class fibonacci {

    // Recursive method to get nth Fibonacci number
    public static long  fibonacci(long n) {
        if (n <= 1) {
            return n;
        }
       // System.out.print(n + ", ");
//        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int count = 10;  // Number of Fibonacci numbers to print

        System.out.println("Fibonacci series up to " + count + " terms:");
        System.out.println(fibonacci(9));

        for (int i = 0; i <=count; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
