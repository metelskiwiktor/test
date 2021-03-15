package pl.wiktor.example.lib;

public class BreakingCharactersUtils {
    private BreakingCharactersUtils() {
    }

    public static String replace(String arg){
        return arg.replaceAll("[\n|\r\t]", "_");
    }
}
