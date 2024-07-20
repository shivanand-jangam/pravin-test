package inheritance;

//Derived class Manager inherits from Employee
class Manager extends Employee {
 String department;

 Manager(String empName, String empId, String dept) {
     super(empName, empId);  // Call the constructor of the base class
     department = dept;
 }

 void displayManager() {
     System.out.println("Name: " + name + ", ID: " + id + ", Department: " + department);
 }
}
