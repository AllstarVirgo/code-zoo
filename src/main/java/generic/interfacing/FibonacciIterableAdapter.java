package generic.interfacing;

import java.util.Iterator;

public class FibonacciIterableAdapter implements Iterable<Integer> {

    private Fibonacci fibonacci;

    private int limit;

    public FibonacciIterableAdapter(Fibonacci fibonacci, int limit) {
        this.fibonacci = fibonacci;
        this.limit = limit;
    }

    /**
     * 迭代器未必一定需要有地方存储，
     * 只需要能够实现 hasNext() next()
     */
    @Override
    public Iterator<Integer> iterator() {

        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return limit > 0;
            }

            @Override
            public Integer next() {
                //计数limit次，不需要依赖fibonacci的count
                limit--;
                return fibonacci.next();
            }
        };
    }


}
