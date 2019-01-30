package counter;

public class CounterTask {

    public static void main(String[] args) {

        Counter countinho = new Counter(42);
        countinho.add(13);
        System.out.println(countinho.get());
        countinho.reset();
        System.out.println(countinho.get());
    }
}
