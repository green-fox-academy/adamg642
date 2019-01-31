public class Counter {

    // Write a recursive function that takes one parameter: n and counts down from n.

    public static void main(String[] args) {

       countToZero(30);

    }

    public static int countToZero(int num) {

        if (num > 0) {
            num--;
            countToZero(num);
            System.out.println(num);
        }
        return num;
    }

}

