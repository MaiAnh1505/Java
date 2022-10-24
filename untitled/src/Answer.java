public class Answer {
    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", content=" + content +
                ", question=" + question +
                ", isCorrect=" + isCorrect +
                '}';
    }

    int id;
    int content;
    int question;
    boolean isCorrect;
}
