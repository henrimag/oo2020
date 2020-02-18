class Persons {
    String name;
    int age;

    void speak() {
        System.out.println("My name is: " + name);
    }
    void calculateYearsToRetirement() {
        int yearsLeft = 65 - age;

        System.out.println(yearsLeft);
    }
    void howMuchLeft() {
        int yearsLeft = 65 - age;
        System.out.println(name + " has " + yearsLeft + " years left till retirement.");
    }
}

public class teine4 {
    public static void main (String[] args) {
        Persons person1 = new Persons();

        person1.name = "Kalle";
        person1.age = 25;

        person1.speak();
        //person1.calculateYearsToRetirement();
        person1.howMuchLeft();
    }
}
