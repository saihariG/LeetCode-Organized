package Strings;

public class ExcelSheetColumnNumber {
    private int titleToNumber(String columnTitle) {
        int result = 0;
        for(char c : columnTitle.toCharArray()) {
            // To get the corresponding value for a character : eg : B -> 2
            int columnValue = c - 'A' + 1;
            result = result * 26 + columnValue;
        }
        return result;
    }
}
