package DZ_11.Exercise_5;

import lombok.Data;

import java.io.Serializable;

@Data
public class Employee implements Serializable {
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

    public void print() {
        System.out.println("\t" + this.firstName + "\t\t" + this.lastName + "\t\t" + this.job + "\t" +
                this.department + "\t\t" + this.age);
    }


}
