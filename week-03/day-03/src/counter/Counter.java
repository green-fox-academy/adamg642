package counter;


public  class Counter {

    int num = 0;
    int defaultNum;






    public Counter() {

    }


    public Counter(int defaultNum) {
        this.num = defaultNum;
        this.defaultNum = defaultNum;
    }

    public void add(int number) {
        num += number;

    }

    public int get() {
        return num;

    }

    public void reset() {

        this.num = defaultNum;


    }



}
