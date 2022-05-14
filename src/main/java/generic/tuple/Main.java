package generic.tuple;

public class Main {
    public static void main(String[] args) {
        FourTuple<String, String, Integer, Integer> fourTuple = new FourTuple<>("a", "b", 1, 2);
        System.out.println(fourTuple);
    }
}
