package postIt;

public class PostIt {

     String backgroungColor;
     String text;
     String textColor;


    public static void main(String[] args) {
        PostIt first = new PostIt("orange","Idea 1","blue");
        PostIt second = new PostIt("pink","Awesome","black");
        PostIt third = new PostIt("yellow","Superb","green");




    }

    public  PostIt (String backgroungColor,String text, String textColor){

       this.backgroungColor = backgroungColor;
       this.text = text;
       this.textColor = textColor;

    }
}
