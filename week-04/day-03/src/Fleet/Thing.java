package Fleet;

/**
 * Created by aze on 2017.03.29..
 */
public class Thing implements Comparable<Thing>  {
    private String name;
    private boolean completed;

    public Thing(String name) {
        this.name = name;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public int compareTo(Thing o){
        if(o.completed && !completed){
            return 1;
        }
        else {
            return -1;
        }



    }

   /* @Override
    public int compareTo(Thing t){
        if (t.completed && !completed){
            return 1;
        }
        else {
            return -1;
        }

    }*/

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }
}
