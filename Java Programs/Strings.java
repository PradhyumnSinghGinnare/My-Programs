import java.util.Scanner;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

public class Strings {
    public static void main(String[] args) {
        String str = "Tony Stark";
        String str1 = "Tony Stark";

        //String length
        System.out.println(str.length());

        //For particular Character
        System.out.println(str.charAt(0));

        //To print every character separate
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();

        //Compare to strings
        System.out.println(str.compareTo(str1));

        //Substring
        System.out.println(str.substring(0, 7));

        //Uppercase
        System.out.println(str.toUpperCase());

        //Lowercase
        System.out.println(str.toLowerCase());

        //replace
        System.out.println(str.replace("T", "S"));

        lastString();
        stringBuilder();
    }

    public static void InputOutput(){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
    }

    public static void lastString(){
        String fruits[] = {"apple", "mango", "banana"};
        String last = fruits[0];
        for(int i=0; i<fruits.length; i++){
            if(last.compareTo(fruits[i]) < 0){
                last = fruits[i];
            }
        }
        System.out.println(last);
    }

    public static void stringBuilder(){
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
