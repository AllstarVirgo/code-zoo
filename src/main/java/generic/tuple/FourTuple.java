package generic.tuple;

public class FourTuple<D, E, F ,G> extends ThreeTuple<D, E, F>{
    public final G g;

    public FourTuple(D d, E e, F f, G g) {
        super(d, e, f);
        this.g = g;
    }

    @Override
    public String toString() {
        return "FourTuple{" +
                "g=" + g +
                ", c=" + c +
                ", a=" + a +
                ", b=" + b +
                '}';
    }
}
