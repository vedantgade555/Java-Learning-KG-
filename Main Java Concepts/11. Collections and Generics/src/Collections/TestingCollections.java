package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestingCollections {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();

        for(int i=10;i>0;i--)
        {
            numList.add(i);
        }

        Collections.sort(numList);
        Utility.print(numList);

        Collections.reverse(numList);
        Utility.print(numList);

//        ArrayList<Integer> unmodifiable = Collections.unmodifiableList(numList);
    }
}
