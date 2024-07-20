package inheritance;

//Derived class Developer inherits from Employee
class Developer extends Employee {
 String programmingLanguage;

 Developer(String empName, String empId, String progLang) {
     super(empName, empId);  // Call the constructor of the base class
     programmingLanguage = progLang;
 }

 void displayDeveloper() {
     System.out.println("Name: " + name + ", ID: " + id + ", Programming Language: " + programmingLanguage);
 }
}