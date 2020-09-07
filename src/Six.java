import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Six {

    int countUnique(List<Integer> intList){
        Set<Integer> uniqueList = new HashSet<>();
        for (int i : intList){
            uniqueList.add(i); //set only has uniques
        }

        return uniqueList.size();
    }
}
