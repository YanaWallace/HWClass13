package HWClass13;

public class Task003 {
    public static void main(String[] args) {
        String str="This sentence I want to reverce";
        String[] words = str.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord += word.charAt(j);
            }
            reversedString += reversedWord + " ";
        }
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversedString);
    }
    }

