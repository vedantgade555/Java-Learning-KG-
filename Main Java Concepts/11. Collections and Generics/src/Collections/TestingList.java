package Collections;

import java.util.ArrayList;

public class TestingList {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("Vedant");
        strList.add("Gade");
//        We can add at any position
        strList.add(1,"Vitthal");
        strList.remove("Vitthal");


        if(strList.contains("Vedant"))
        {
            System.out.println(strList.indexOf(("Vedant")));
        }

        for(int i=0;i<strList.size();i++)
        {
            System.out.println(strList.get(i));
        }
        System.out.println(strList.get(0));

        for (String s : strList) {
            System.out.println(s);
        }

    }
}
