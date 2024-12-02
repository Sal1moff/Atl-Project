package Bank;

public class Director extends Manager {
    public double bonus;

    public Director(int no,String name,int year,String department, String departmentManaged, double bonus) {
        super(no, name, year, department, departmentManaged);
        this.bonus = bonus;
    }
}
