import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by KPS on 7/24/2020.
 */
public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Blue");
        stringList.add("Areen");
        stringList.add("Red");
        for (String string : stringList){
            System.out.println(string);
        }
        stringList.sort(new ListComparator());
        for (String string :stringList){
            System.out.println(string);
        }

    }

}
class ListComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}