package stringandcahrecter;

public class String_and_Character {
    public static void main(String[] args) {
        String str = "Mt name is Milan";
        System.out.println(str.charAt(5));
        System.out.println(str.length());
        System.out.println(str.concat("Pun"));
        System.out.println(str.endsWith("a"));
        System.out.println(str.contains("a"));
        System.out.println(str.isEmpty());
        System.out.println(str.replace("Milan","James:"));
//        System.out.println(str.split(" "));
//        String [] s = data;
//        for(String s: data){
//        System.out.println(s);

      //  }
        System.out.println(str.toString());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(4,7));


    }
}
