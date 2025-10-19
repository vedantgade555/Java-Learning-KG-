package Collections;

import java.util.Collection;
//We can accept all type of collections
public class Utility {
    public static void print(Collection collection)
    {
        for (Object coll : collection) {
            System.out.printf("%s ",coll);
        }
    }
}
