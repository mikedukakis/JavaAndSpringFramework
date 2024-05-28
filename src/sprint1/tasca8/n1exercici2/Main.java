package sprint1.tasca8.n1exercici2;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("car", "truck", "lorry", "airplane",
                "motorbike", "bicycle", "van", "helicopter");

        System.out.println(StringHandler.filterStrings(vehicles));
    }
}
