package DZ_13.Exercise_4;

import java.util.ArrayList;

public class Exercise_4 {
    public static void main(String[] args) {
        try{
            ArrayList<Projector> projectors = new ArrayList<>();
            projectors.add(new Projector("Ultra", 2020, 14000, "IBM"));
            projectors.add(new Projector("Super", 2021, 15000, "Apple"));
            projectors.add(new Projector("First", 2018, 12500, "Nokia"));
            projectors.add(new Projector("Second", 2020, 13000, "Bind"));
            projectors.add(new Projector("High", 2022, 18000, "Mobil"));
            projectors.add(new Projector("Disco", 2019, 16000, "MMK"));
            projectors.add(new Projector("Second_2", 2021, 13500, "Bind"));
            projectors.add(new Projector("High_2", 2022, 18500, "Mobil"));
            projectors.add(new Projector("Disco_2", 2020, 16500, "MMK"));
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
