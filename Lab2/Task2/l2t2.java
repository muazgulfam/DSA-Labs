class l2t2 {
    public static void main(String[] args) {
        String sentence1 = "Dawood University of Engineering & Technology";
        String[] sentence2 = new String[45];
        for (int i = 0; i < sentence1.length(); i++) {
            char temp = sentence1.charAt(i);
            sentence2[i] = String.valueOf(temp);
        }
        for (int i = 0; i < sentence2.length; i++) {
            System.out.print(sentence2[i]);
        }
    }
}