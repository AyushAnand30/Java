public class Stringcomp {
    public static void main(String[]args){
        String s1 = "happy";
        String s2 = "New";
        String s3 = "Love you moni";
        String s4 = "Shivam";
        System.out.println("The length of the string is " + s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s3.indexOf(s3));
        System.out.println(s3.indexOf("moni"));
        System.out.println(s3.concat(s4));
        System.out.println(s3.compareTo(s4));
        
    }
}
