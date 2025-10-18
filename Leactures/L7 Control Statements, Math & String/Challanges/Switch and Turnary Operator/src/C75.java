class arrToString {
    public static void main(String[] args) {
        String[] arr= new String[]{"Vedant Vitthal Gade ","CEO and Founder of ","Kastrika Group of Industries"};
        StringBuilder sb = new StringBuilder();
        for (String str:arr){
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
