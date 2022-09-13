package DZ_11.Exercise_5;

import lombok.Data;

@Data
public class Employee {
    String firstName;
    String lastName;
    String job;
    String department;
    int age;

    public Employee() {

    }

    public Employee(String firstName, String lastName, String job, String department, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.job = job;
        this.department = department;
        this.age = age;
    }

    public String print() {
        return "\t" + this.firstName + "\t" + this.lastName + "\t" + this.job + "\t" +
                this.department + "\t" + this.age;
    }


}
