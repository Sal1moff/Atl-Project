package StudentMap;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistator {

    Map<Integer, StudentMap> students = new HashMap<>();

    public void addStudent(int id, String name) {
        students.put(id, new StudentMap(id, name));
    }

    public void removeStudent(int id) {
        students.remove(id);
        System.out.println("ID" + id + "e aid student silindi.");

    }

    public StudentMap getStudent(int id) {
        return students.get(id);
    }

    public void listAllStudents() {
        for (StudentMap stud : students.values()) {
            System.out.println(stud);
        }
    }
}
