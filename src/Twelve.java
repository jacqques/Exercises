import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Twelve {

    boolean contains3(List<String> theList){
        boolean result = false;
        Map<String, Integer> coolerList = new HashMap<>();
        for (String str : theList){
            if (coolerList.containsKey(str)){
                coolerList.put(str,coolerList.get(str) + 1);
                if (coolerList.get(str) == 3){
                    return true;
                }
            }
            else {
                coolerList.put(str,1);
            }

        }
        return result;
    }
}
