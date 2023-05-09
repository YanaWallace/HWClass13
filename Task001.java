package HWClass13;

public class Task001 {
    public static void main(String[] args) {
        String sentence = "This is a sentence with spaces.";
        String sentenceWithoutSpaces = sentence.replaceAll("\\s", "");
        System.out.println(sentenceWithoutSpaces);
    }
}
