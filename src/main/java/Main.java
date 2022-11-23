import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("Andrei");
        arr.add("Andrei");
        arr.add("Andrei");
        arr.add("Superman");
        arr.add("Apple");
        arr.add("Scaun");
        arr.add("Scaun");
//        System.out.println(removeDuplicates(arr));
//        System.out.println(removeDuplicatesWIthSet(arr));
        List<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Andrei");
//        System.out.println(removeDuplicates(l2));
//        Map<String, Integer> stringIntegerMap = new HashMap<>();
//        for (String key: stringIntegerMap.keySet()){
//            System.out.println(stringIntegerMap.get(key));
//        }
    }

    private static List<String> removeDuplicates(List<String> aList) {
        return aList.stream().distinct().collect(Collectors.toList());
//        List<String> uniqs = new ArrayList<>();


//        for (String s : aList) {
//            if (!uniqs.contains(s)) uniqs.add(s);
//        }
//        return uniqs;




//        Iterator<String> it = aList.iterator();
//        while (it.hasNext()){
//            String s = it.next();
//            if (!uniqs.contains(s)) uniqs.add(s);
//        }
//        return uniqs;
    }

    private static List<String> removeDuplicatesWIthSet(List<String> aList){
        Set<String> uniq = new HashSet<>();
//        uniq.addAll(aList);
//        for (String s: aList) uniq.add(s);

        Iterator<String> it = aList.iterator();
        while (it.hasNext()) uniq.add(it.next());
        return new ArrayList<>(uniq);
    }
}