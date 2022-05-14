package generic.interfacing;

public class Main {
    public static void main(String[] args) {
        FibonacciIterableAdapter fibonacciIterableAdapter = new FibonacciIterableAdapter(new Fibonacci(), 18);
        for (Integer integer : fibonacciIterableAdapter) {
            System.out.println(integer);
        }
    }
}
