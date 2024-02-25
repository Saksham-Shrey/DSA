package StringSubsets;

public class RemoveApple {
    public static void main(String[] args) {
                System.out.println(remApple("albeapplequerque"));
    }

            public static String remApple(String str) {
                if (str.isEmpty())
                    return "";

                if (str.startsWith("apple"))
                    return remApple(str.substring(5));
                else {
                    return str.charAt(0) + remApple(str.substring(1));
                }
           }
}



