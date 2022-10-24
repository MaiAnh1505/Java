import java.sql.Date;
public class Question {
    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", cuestion='" + cuestion + '\'' +
                ", type=" + type +
                ", category=" + category +
                ", creator=" + creator +
                ", createDate=" + createDate +
                '}';
    }

    int id;
    String cuestion;
    TypeQuestion type;
    int category;
    Account creator;
    Date createDate;


}
