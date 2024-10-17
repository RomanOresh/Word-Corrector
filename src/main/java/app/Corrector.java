package app;

public class Corrector {
    public String handleData(String[] strs) {
        StringBuilder stringBuilder1 = new StringBuilder();
        int count = 0;
        for (String str : strs) {
            if (str.contains("b")) {
                str = str.replace("b", "o");
            }
            count++;
            stringBuilder1.append(count).append(") ").append(str).append("\n");
        }
        return stringBuilder1.toString();
    }
}
