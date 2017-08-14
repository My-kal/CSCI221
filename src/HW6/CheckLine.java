package HW6;


public class CheckLine {

    private String[] keywords;
    private char[] invalidSymbols;

    /**
     * @param kWords
     * @param invalidS
     * Precondition: kWords != null and invalidS != null
     */
    public CheckLine(String[] kWords, char[] invalidS){
        keywords = kWords;
        invalidSymbols = invalidS;
    }

    /**
     * Precondition: strKeyword != null
     * @param strKeyword
     * @return true if the provided string matches the first element in the keywords array
     */
    public boolean checkFirstKeyword(String strKeyword) {
        return strKeyword.contains(keywords[0]);
    }

    /**
     * Precondition: line != null
     * @param line
     * @throws SymbolException
     */
    public void checkForInvalidSymbols(String line) throws SymbolException {
        for (char c : invalidSymbols) {
            if (line.indexOf(c) != -1)
                throw new SymbolException(String.format("Invalid symbol [%s]", c));
        }
    }

    /**
     * Precondition: strKeyword != null
     * @param strKeyword
     * @throws KeywordException
     */
    public void checkForInvalidKeyword(String strKeyword) throws KeywordException {
        boolean match = false;
        for (String s : keywords) {
            if (strKeyword.contains(s))
                match = true;
        }
        if (!match)
            throw new KeywordException();
    }
}
