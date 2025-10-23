package Challanges;

import java.util.List;

class StringFilterAndConcatinate {
    public static void main(String[] args) {
        List<String> strs = List.of("Vedant Gade","is learning Java","on KG","tO bUILD A Empire","Nmae is Kshtriya Industries");
        String result =  strs.stream()
                 .filter(str->str.length()>10).reduce("",(a,b)-> a+" "+b);

        System.out.println(result);
    }

}
