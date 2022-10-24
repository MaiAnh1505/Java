import java.sql.Date;
import java.sql.Time;
import java.util.Arrays;

public class Exam {
    @Override
    public String toString() {
        return "Exam{" +
                "id=" + id +
                ", code=" + code +
                ", title=" + title +
                ", categoryQuestion=" + categoryQuestion +
                ", categoryID=" + categoryID +
                ", duration=" + duration +
                ", creatorID=" + creatorID +
                ", createDate=" + createDate +
                ", questions=" + Arrays.toString(questions) +
                '}';
    }

    int id;
    int code;
    int title;
    CategoryQuestion categoryQuestion;
    int categoryID;
    Time duration;
    int creatorID;
    Date createDate;
    Question[] questions;

}
