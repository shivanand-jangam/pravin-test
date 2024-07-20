package inheritance;

//Base class
class Employee {
 String name;
 String id;

 Employee(String empName, String empId) {
     name = empName;
     id = empId;
 }

 void displayDetails() {
     System.out.println("Name: " + name + ", ID: " + id);
 }
}
