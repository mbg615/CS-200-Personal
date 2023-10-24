public class FibonacciCalaculator {
    public int calculateFibonacci(int n) {
        if(n == 1 || n == 0) {
            return n;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }
}
