package chapter01;

public class ConstructorLesson1 {
    public static void main(String[] args) {
        Chicken c1 = new Chicken();
        Chicken c2 = new Chicken();
        System.out.println();
    }
}

class Chicken{
    int numEggs;
    String name;

    public Chicken (){
        name = "Almond";
    }
}

class Swan {
    int numberEggs;
    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.numberEggs = 1;
        System.out.println("Swan Number of Eggs is " + mother.numberEggs);
    }
}

class Name{
    String first = "Darren";
    String last = "Sayo";
    String full = first + last;

    public static void main(String[] args) {
        Name name1 = new Name();
        System.out.println(name1.full);
        name1.first = "Totoy";
        name1.last = "Brown";
        System.out.println(name1.full);
    }
}