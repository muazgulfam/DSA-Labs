public class l2t3 {
    public static void main(String[] args) {
        String sentence = "Dawood University of Engineering & Technology.";

        sentence = sentence.replaceAll(" ", "");
        sentence = sentence.replace('.', ':');
        System.out.println(sentence);
    }
}
