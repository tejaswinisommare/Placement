import java.util.HashMap;

class MaxOccChar {

    public static void main(String[] args) {

        String str = "Programming";

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (Character c : str.toCharArray()) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }

        }
        System.out.println(charCount);
    }
}