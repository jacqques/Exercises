import java.util.List;

public class One {

    int numberOfVowels(List<String> str){
        int result = 0;
        String vowels = "a e i o u";
        for (String s : str){
            for (char c : s.toCharArray()){
                if (vowels.contains(c + "")){ // + "" to make it a string not a char
                    result++;
                }
            }
        }

        return result;
    }
}
