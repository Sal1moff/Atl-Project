package Bank;

public class BankMain {public static void main(String[] args) {
    Employee emp = new Employee(1, "Xanbala Salimov", 2020, "Engineering");
    Manager mgr = new Manager(2, "Ali Qasimov", 2018, "Engineering", "Development");
    Director dir = new Director(3, "Vali Karimli", 2015, "Corporate", "Strategy", 10000.0);

    System.out.println("Employee Name: " + emp.name);
    System.out.println("Manager Department: " + mgr.departmentManaged);
    System.out.println("Director Bonus: $" + dir.bonus);
}
}
