package StudentMap;

public class MainStudentMap {
    public static void main(String[] args) {
        StudentRegistator register = new StudentRegistator();
        register.addStudent(1, "alice");
        register.addStudent(2, "bob");
        register.addStudent(3, "charlie");


        System.out.println("Bütün telebeler:");
        register.listAllStudents();
        System.out.println("ID 2e aid student:");
        System.out.println(register.getStudent(2));
        System.out.println("ID 2e aid studenti sil:");
        register.removeStudent(2);
        System.out.println("Silinmeden sonraki elementler:");
        register.listAllStudents();


    }
}
