public class StringUtils {

    public static boolean included(String word, String searched) {
        if (isEmpty(word) || isEmpty(searched)) return false;
        return word.trim().toUpperCase().contains(searched.trim().toUpperCase());
    }

    private static boolean isEmpty(String text) {
        return null == text || text.isEmpty();
    }
}
