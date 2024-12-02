package Bank;

public class Manager extends Employee {
    public String departmentManaged;
    public static final int MANAGEMENT_PAYMENT = 5000;

    public Manager(int no, String name, int year, String department, String departmentManaged) {
        super(no, name, year, department);
        this.departmentManaged = departmentManaged;
    }

    @Override
    public int salary() {
        return super.salary() + MANAGEMENT_PAYMENT;
    }

    @Override
    public void jobs() {
        System.out.println(name + " adli manager " + departmentManaged + " de isleyir.");


    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Department Managed:" + departmentManaged);
        System.out.println("Manager salary:" + salary());
    }
}
