package Challanges;

import java.util.*;

class ListSwap {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,7,9,2,1,5,4,6);
        System.out.println(list);
        swap(list,5,2);
        System.out.println(list);
    }

    public static void swap(List<Integer> list,int x,int y)
    {
        int temp;
        temp = list.get(x);
        list.set(x,list.get(y));
        list.set(y,temp);
    }
}
