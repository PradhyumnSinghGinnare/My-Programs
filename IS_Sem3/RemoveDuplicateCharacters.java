public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String s = "navneet";
        String s1 = removeDuplicateCharacters(s);
        System.out.println(s1);
    }

    public static String removeDuplicateCharacters(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length() - 1; i++) {
            for (int j = i + 1; j < sb.length(); j++) {
                if (sb.charAt(i) == sb.charAt(j)) {
                    sb.deleteCharAt(j);
                }
            }
        }
        return sb.toString();
    }
}
