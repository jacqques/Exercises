import java.util.*;

public class Main {

    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------
        One one = new One();
        List<String> testOne = new ArrayList<>();
        testOne.add("tvghladddd");  //1
        testOne.add("ok");   //1
        testOne.add("oiua"); //4
        System.out.println(one.numberOfVowels(testOne));
        //--------------------------------------------------------------------------------------------------------------

        Six six = new Six();
        List<Integer> listInts = new ArrayList<>();
        listInts.add(1);
        listInts.add(1);
        listInts.add(2);
        listInts.add(4);
        listInts.add(-10);
        System.out.println(six.countUnique(listInts));
        //--------------------------------------------------------------------------------------------------------------
        Eight eight = new Eight();
        System.out.println(eight.shortestString(testOne)); //noice
        System.out.println(eight.shortestString(new ArrayList<String>())); // 0 is 0
        //--------------------------------------------------------------------------------------------------------------
        Ten ten = new Ten();
        Set<String> tenTest = new HashSet<>();
        tenTest.add("okok");
        tenTest.add("oka");
        tenTest.add("tratrala");
        tenTest.add("aka");
        System.out.println(ten.removeOddLength(tenTest));
        //--------------------------------------------------------------------------------------------------------------
        Twelve twelve = new Twelve();
        System.out.println(twelve.contains3(testOne));
        testOne.add("ok");
        testOne.add("ok");
        testOne.add("ok");
        System.out.println(twelve.contains3(testOne));
        //--------------------------------------------------------------------------------------------------------------
        Unlucky unlucky = new Unlucky();
        Map<String,String> mapUnlucky = new HashMap<>();
        mapUnlucky.put("ok","ok");
        mapUnlucky.put("nej","hej");
        mapUnlucky.put("ad", "stop");
        //mapUnlucky.put("av","ok");    false/true changer
        System.out.println(unlucky.isUnique(mapUnlucky));
    }
}
