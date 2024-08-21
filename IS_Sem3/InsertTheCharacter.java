public class InsertTheCharacter {
    public static void main(String[] args) {
        String s = "navneet";
        String s1 = insertCharacter(s);
        System.out.println(s1);
    }

    public static String insertCharacter(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.insert(2,"Hi");
        return sb.toString();
    }
}
