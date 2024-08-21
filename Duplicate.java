public class Duplicate {

    public static void main(String[] args) {
        String str = "Happybirthdaytoyou";
        String dup = "";
        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            char str1 = str.charAt(i);
            boolean isDuplicate = false;
            for (int j = 0; j < dup.length(); j++) {
                if (dup.charAt(j) == str1) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                dup += str1;
            }
        }

        System.out.println(dup);

    }

}
