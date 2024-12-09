package SetPrint;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Student> students = new LinkedHashSet<>();
        students.add(new Student("ilkin", 1));
        students.add(new Student("xan", 2));
        students.add(new Student("elnur", 3));
        students.add(new Student("emin", 4));
        students.add(new Student("musa", 5));
        students.add(new Student("huseyn", 6));

        Student varmi = new Student("tofiq", 3);
        if (!students.add(varmi)) {
            System.out.println("bu id var,elave edilmedi" + varmi);
        } else {
            System.out.println("telebe elave edildi");
        }
        for (Student stud : students) {
            System.out.println(stud);
        }

        int search = 2;
        boolean found = false;
        for (Student study : students) {
            if (study.getId() == search) {
                System.out.println("found" + study);
                found = true;
                break;
            }
            if (found) {
                System.out.println( "Student ID " + search + " not found");
            }
        }
        int search2=7;
         found=false;
        for (Student study:students){
            if(study.getId()==search2){
                System.out.println("found"+study);
                found=true;
                break;
            }

        }
        if(!found){
            System.out.println("Student with ID "+search2+"  not found");
        }
    }


}
