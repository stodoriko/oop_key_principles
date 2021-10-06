package domain;

public class Answer {

    private String answerImageUrl;
    private String answerName;
    private String answerText;
    private int countAnswers;

    public Answer(String answerImageUrl, String answerName, String answerText, int countAnswers) {
        this.answerImageUrl = answerImageUrl;
        this.answerName = answerName;
        this.answerText = answerText;
        this.countAnswers = countAnswers;
    }

    public String getAnswerImageUrl() {
        return answerImageUrl;
    }

    public void setAnswerImageUrl(String answerImageUrl) {
        this.answerImageUrl = answerImageUrl;
    }

    public String getAnswerName() {
        return answerName;
    }

    public void setAnswerName(String answerName) {
        this.answerName = answerName;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public int getCountAnswers() {
        return countAnswers;
    }

    public void setCountAnswers(int countAnswers) {
        this.countAnswers = countAnswers;
    }
}
