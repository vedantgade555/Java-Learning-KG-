//. Concatenate and Convert: Take two strings, concatenate them,
//and convert the result to uppercase.
class Concatenation {
    public static void main(String[] args) {
        String firstName= "Vedant";
        String lastName= "Gade";

//    String fullName= firstName+" "+lastName;
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName.toUpperCase());
    }
}
