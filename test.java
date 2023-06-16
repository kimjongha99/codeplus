public class test {
    public static void main(String[] args) {
        String str = "baaa";

        int[] charCount = new int[256]; // Assuming ASCII characters

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charCount[ch]++;
        }

        char mostFrequentChar = ' ';
        int maxCount = 0;

        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > maxCount) {
                mostFrequentChar = (char) i;
                maxCount = charCount[i];
            }
        }

        System.out.println("Most frequent character: " + mostFrequentChar);
    }
}
