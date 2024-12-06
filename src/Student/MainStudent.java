package Student;

import java.time.LocalDate;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Hüseyn", LocalDate.of(2005, 3, 15)),
                new Student("Aydın", LocalDate.of(2010, 7, 20)),
                new Student("Tural", LocalDate.of(1995, 11, 5))
        };
        Student[] cloneStudent = students.clone();
        Student[] manualStudent = new Student[students.length];
        for (int i = 0; i < students.length; i++) {
            manualStudent[i] = students[i];
        }

//        Student[] underAge = new Student[0];
//        for (int i = 0; i < students.length; i++) {
//            if (students[i].calculateAge() < 18) {
//                students[i] = underAge[i];
//            }
//        }


        System.out.println("Clone edilmis array:");
        for (Student student : cloneStudent) {
            System.out.println(student);
        }
        System.out.println("Manuel edilmis array:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

}

