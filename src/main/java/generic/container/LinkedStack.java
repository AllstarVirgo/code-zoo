package generic.container;

public class LinkedStack<T> {
    private static class Node<T> {
        T item;

        Node<T> next;

        public Node(T item, Node<T> next) {
            this.item = item;
            this.next = next;
        }

        public Node() {
        }

        boolean end() {
            return item == null;
        }
    }

    private Node<T> sentinel = new Node<>();

    public void push(T item) {
        sentinel = new Node<>(item, sentinel);
    }

    public T pop() {
        T item = sentinel.item;
        if (!sentinel.end()) {
            sentinel = sentinel.next;
        }
        return item;
    }

    public static void main(String[] args) {
        LinkedStack<String> linkedStack = new LinkedStack<>();
        String[] split = "private Node<T> sentinel".split(" ");
        for (String s : split) {
            linkedStack.push(s);
        }
        String s;
        while ((s = linkedStack.pop()) != null) {
            System.out.println(s);
        }
    }
}
