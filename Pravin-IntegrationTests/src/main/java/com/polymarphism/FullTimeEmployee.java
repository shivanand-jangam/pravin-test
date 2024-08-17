package polymarphism;

//Subclass 1: FullTimeEmployee
class FullTimeEmployee extends Employee {
 double bonus;

 FullTimeEmployee(String name, double baseSalary, double bonus) {
     super(name, baseSalary);
     this.bonus = bonus;
 }

 @Override
 double calculateSalary() {
     return baseSalary + bonus;
 }
}

