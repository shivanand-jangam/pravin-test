package inheritance;

//Main class to demonstrate inheritance
public class Main {
 public static void main(String[] args) {
     // Creating instances of Manager and Developer
     Manager manager = new Manager("Alice", "M100", "HR");
     Developer developer = new Developer("Bob", "D200", "Python");

     // Using methods from the base class
     manager.displayDetails();
     manager.displayManager();

     System.out.println();

     developer.displayDetails();
     developer.displayDeveloper();
 }
}
