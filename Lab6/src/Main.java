public class Main {
    public static void main(String[] args) {
        FibonacciCalaculator calculator = new FibonacciCalaculator();
        int fib11 = calculator.calculateFibonacci(11);
        System.out.println("Fib(11) is " +fib11);
    }
}