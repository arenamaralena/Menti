package ModulThree;

public class SpamAnalyzer extends KeywordAnalyzer{
    private final String[] keywords;
    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }
    @Override
    protected String[] getKeywords() {
        String[] keys = keywords;
        return keys;
    }
    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }
}
