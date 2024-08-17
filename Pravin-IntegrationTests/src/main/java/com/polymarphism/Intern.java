package polymarphism;

//Subclass 3: Intern
class Intern extends Employee {
 Intern(String name, double stipend) {
     super(name, stipend);
 }

 // Interns have a fixed stipend, so no need to override calculateSalary
}
