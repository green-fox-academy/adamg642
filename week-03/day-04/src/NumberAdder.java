public class NumberAdder {

    public static void main(String[] args) {

        addnNumToN(100,30);


    }

    public static int addnNumToN(int from, int to) {
        if (from < to) {

            if (from < to) {
                from++;
                addnNumToN(from, to);
                System.out.println(from);

            }

            return from;
        }
       return -1;
    }

}
