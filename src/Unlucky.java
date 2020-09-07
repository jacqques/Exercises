import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Unlucky {

    boolean isUnique(Map<String,String> theMap){
        List<String> hasBeenList = new ArrayList<>();
        for (String str : theMap.values()){
            if (hasBeenList.contains(str)){
                return false;
            }
            else {
                hasBeenList.add(str);
            }
        }
        return true;
    }

}

