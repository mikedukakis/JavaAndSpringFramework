package sprint1.tasca8.n1exercici7;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MixedList {

    public static List<String> filterStrings(List<Object> mixedList) {
        List<String> filteredStrings = mixedList.stream()
                .filter(object -> object instanceof String)
                .map(object -> (String) object)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .collect(Collectors.toList());
        return filteredStrings;
    }
}
