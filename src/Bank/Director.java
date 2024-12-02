package Bank;

public class Director extends Manager {
    public double bonus;

    public Director(int no,String name,int year,String department, String departmentManaged, double bonus) {
        super(no, name, year, department, departmentManaged);
        this.bonus = bonus;
    }


    @Override
    public int salary() {
        return (int) (super.salary()+bonus);

    }

    @Override
    public void jobs() {
        System.out.println(name+"-adli direktor "+department+"-de isleyir");

    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Bonus:"+bonus);
        System.out.println("Director umumi maasi:"+salary());
    }
}
