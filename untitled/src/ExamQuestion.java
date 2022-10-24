import java.util.Arrays;

public class ExamQuestion {
    @Override
    public String toString() {
        return "ExamQuestion{" +
                "id=" + id +
                ", questions=" + Arrays.toString(questions) +
                '}';
    }

    int id;
    Question[] questions;
}
