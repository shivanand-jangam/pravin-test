package polymarphism;

//Subclass 2: PartTimeEmployee
class PartTimeEmployee extends Employee {
 int hoursWorked;
 double hourlyRate;

 PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
     super(name, hourlyRate * hoursWorked);
     this.hourlyRate = hourlyRate;
     this.hoursWorked = hoursWorked;
 }

 @Override
 double calculateSalary() {
     return hoursWorked * hourlyRate;
 }
}