package DZ_3;

public class Pilot extends Human{
    String position;
    String rank;
    int experience;
    int salary;

    public Pilot(){
        this.name = "No name";
        this.age = 0;
        this.height = 0;
        this.position = "No position";
        this.rank="No rank";
        this.experience = 0;
        this.salary = 0;
    }

    public Pilot(String name, int age, int height, String position, String rank, int experience, int salary){
        this.name = name;
        this.age = age;
        this.height = height;
        this.position = position;
        this.rank = rank;
        this.experience = experience;
        this.salary = salary;
    }

    public void toWork() {
        System.out.println(this.name + " to Flew!");
    }

    public String toString() {
        return "Name: " + this.name + "\n" + "Age: " + this.age + "\n" + "Height: " + this.height+"\n"+
                "Position: " + this.position + "\n"+ "Rank: " + this.rank + "\n" +
                "\n"+ "Experience: " + this.experience + "Salary: " + this.salary;
    }
}
