package polymarphism;

public class PolymorphismEmployeeExample {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Alice", 50000, 10000);
        Employee emp2 = new PartTimeEmployee("Bob", 20, 80);
        Employee emp3 = new Intern("Charlie", 1000);

        System.out.println(emp1.name + "'s Salary: " + emp1.calculateSalary());
        System.out.println(emp2.name + "'s Salary: " + emp2.calculateSalary());
        System.out.println(emp3.name + "'s Salary: " + emp3.calculateSalary());
    }
}