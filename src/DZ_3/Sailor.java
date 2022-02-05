package DZ_3;

public class Sailor extends Human {
    String position;
    String rank;
    int salary;

    public Sailor(){
        this.name = "No name";
        this.age = 0;
        this.height = 0;
        this.position = "No position";
        this.rank="No rank";
        this.salary = 0;
    }

    public Sailor(String name, int age, int height, String position, String rank, int salary){
        this.name = name;
        this.age = age;
        this.height = height;
        this.position = position;
        this.rank = rank;
        this.salary = salary;
    }

    public void toWork() {
        System.out.println(this.name + " gone Swimming!");
    }

    public String toString() {
        return "Name: " + this.name + "\n" + "Age: " + this.age + "\n" + "Height: " + this.height+"\n"+
                "Position: " + this.position + "\n"+ "Rank: " + this.rank + "\n" + "Salary: " + this.salary;
    }
}
