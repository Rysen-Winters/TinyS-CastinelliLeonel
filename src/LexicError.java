public class LexicError extends Error {
    public LexicError(String errorType, int ln, int cl){
        super("Error lexico: "+ errorType, ln, cl);
    }
}
