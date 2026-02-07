public class RemoveDupChar {
    public static void main(String[] args) {
        String input = "Saanny";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Append only if character not already in result
            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch);
            }
        }
        System.out.println("String after removing duplicates: " + result);
    }
}