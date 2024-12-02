package Bank;

public class Manager extends Employee {
    public String departmentManaged;
    public static final int MANAGEMENT_PAYMENT = 5000;

    public Manager(int no,String name,int year,String department, String departmentManaged) {
        super(no, name, year, department);

    }
}
