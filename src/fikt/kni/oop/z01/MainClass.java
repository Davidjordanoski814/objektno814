package fikt.kni.oop.z01;

public class MainClass {
    public static void main(String[] args) {
        Student object1 = new Student ();
        object1.firstName = "David";
        object1.lastName = "Jordanoski";
        object1.index = 814;
        System.out.println("Podatoci za prv objekt:");
        System.out.println(object1.firstName + " " + object1.lastName + " " + object1.index);
        Student object2 = new Student("Angela","Petroska",2212);

        System.out.println ("Podatoci za vtor objekt :");
        System.out.println (object2.firstName + " " + object2.lastName + " " + object2.index);
    }
}
