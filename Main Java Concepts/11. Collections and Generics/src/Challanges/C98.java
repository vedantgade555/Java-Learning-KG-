package Challanges;

import java.util.*;

class CountryMap {
    public static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("Bharat", "New Delhi");
        countryMap.put("China", "Beijing");
        countryMap.put("Pakistan", "Islamabad");
        countryMap.put("Srilanka", "Colombo");
        countryMap.put("Bangladesh", "Dhaka");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Country name: ");
        String country = sc.next();

        if (countryMap.containsKey(country)) {
            System.out.printf("Capital of %s is %s%n", country, countryMap.get(country));
        } else {
            System.out.println("Country not found");
        }

        sc.close();
    }
}
