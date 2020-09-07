import java.util.List;

public class Eight {

    int shortestString(List<String> str){
        if (str.size() == 0){
            return 0;
        }
        int minLen = str.get(0).length();
        for (String s : str){
            minLen = Math.min(minLen,s.length());
        }
        return minLen;
    }
}
