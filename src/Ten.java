import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Ten {

    Set<String> removeOddLength (Set<String> original){
        Set<String> result = new HashSet<>();
        result = original.stream()
                .filter(n -> n.length() % 2 == 0)
                .collect(Collectors.toSet());

        return result;
    }
}
