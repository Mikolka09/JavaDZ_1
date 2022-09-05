package DZ_9;

import lombok.Data;

@Data
public class World {
    String name;
    int count;

    public World(String str, int count) {
        this.name = str;
        this.count = count;
    }
}
