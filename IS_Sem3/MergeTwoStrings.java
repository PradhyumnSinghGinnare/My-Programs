public class MergeTwoStrings {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String mergedString = mergeTwoString(s1, s2);
        System.out.println(mergedString);
    }

    public static String mergeTwoString(String s1, String s2) {
        StringBuilder sb1 = new StringBuilder(s1);
        StringBuilder sb2 = new StringBuilder(s2);
        sb1.append(sb2);
        return sb1.toString();
    }
}
