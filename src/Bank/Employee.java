package Bank;

public class Employee {
    public int no;
    public String name;
    public int year;
    public String department;
    public static final int BASE_SALARY = 500;

    public Employee(int no, String name, int year, String department) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.department = department;
    }

    public int salary() {
        return year * BASE_SALARY;
    }

    public void printInfo() {
        System.out.println("Employee NO:" + no);
        System.out.println("Employee name:" + name);
        System.out.println("Employee year:" + year);
        System.out.println("Department:" + department);
    }

    public void jobs() {
        System.out.println(name + "-adli isci " + department + "-de isleyir,ve maasi:"+salary());
    }


}
