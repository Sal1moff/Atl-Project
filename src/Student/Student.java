package Student;

import java.time.LocalDate;
import java.time.Period;

public class Student {
    private String name;
    private LocalDate birthDate;

    public Student(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Period calculateAge() {
        return Period.between(birthDate, LocalDate.ofEpochDay(LocalDate.now().getYear()));
    }

    public void info() {
        System.out.println("Telebe:" + name + " dogum tarixi:" + birthDate);
    }


    private String addStudent(String name, Period age) {
        this.name = name;
        age = calculateAge();
        return name + " " + age;
    }
}
