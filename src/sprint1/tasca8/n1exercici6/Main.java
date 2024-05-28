package sprint1.tasca8.n1exercici6;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Object> mixedList = Arrays.asList(22, "helicopter", 15, "car", "airplane",
                12, "motorbike", 55, "van", 3, "lorry", 101);

        System.out.println("Strings from shorter to longer: " + MixedList.filterStrings(mixedList));
    }

}
