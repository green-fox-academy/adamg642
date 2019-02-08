class Animal {
    int age = 13;
    String name;


    public static void main(String[] args){
        Animal animal = new Animal();
        System.out.println(animal.getAge());
    }

    public int getAge(){

        return age;
    }


}
