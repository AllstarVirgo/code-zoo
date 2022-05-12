package generic;

import java.util.Random;

public class Picture implements Resource{

    Random random = new Random();

    @Override
    public long getId() {
        return random.nextInt();
    }

    private long size;

    public Picture(long size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "size=" + size +
                '}';
    }
}
