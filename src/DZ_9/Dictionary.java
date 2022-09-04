package DZ_9;


import lombok.Data;

import java.util.ArrayList;
import java.util.TreeMap;

@Data
public class Dictionary {
    TreeMap<String, ArrayList<String>> dictionary;
    ArrayList<String> worlds;
}
