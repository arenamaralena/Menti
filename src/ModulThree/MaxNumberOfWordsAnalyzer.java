package ModulThree;

public class MaxNumberOfWordsAnalyzer extends KeywordAnalyzer {
    private final int maxNumber;
    private final String[] keywords;

    public MaxNumberOfWordsAnalyzer(int maxNumber, String[] keywords) {
        this.maxNumber = maxNumber;
        this.keywords = keywords;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.TOO_MUCH_KEYWORDS;
    }

    @Override
    public Label processText(String text) {
        int countWords = 0;
        String[] words = text.replaceAll("\\p{P}", " ").split(" ");
        for (String keyword : getKeywords()) {
            for (String word : words) {
                if (word.equals(keyword)) {
                    countWords++;
                }
                if (countWords >= maxNumber) {
                    return getLabel();
                }
            }
        }
        return Label.OK;
    }
}
