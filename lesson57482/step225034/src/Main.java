/**
 * It returns a double value or 0.0 if an exception occurred
 */
public class Main {
    public static double convertStringToDouble(String s) {
        try {
            return Double.parseDouble(s);
        } catch (IllegalArgumentException e){
            return Double.parseDouble("0");
        }
    }
}