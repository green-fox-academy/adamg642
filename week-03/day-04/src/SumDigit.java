public class SumDigit {

    // Given a non-negative int n, return the sum of its digits recursively (no loops).
    // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
    // divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
    public static void main(String[] args) {
        digitAdder(128003,0);

    }

    public static int digitAdder (int n,int a){
        if (n>0) {
            a += n % 10;
            n = n / 10;
            digitAdder(n, a);
            System.out.println(n);
            System.out.println(a);
        }
        System.out.println(n);
        System.out.println(a);
    return a;
    }

}
