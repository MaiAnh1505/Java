import java.sql.Date;
import java.util.Arrays;

public class Account {
    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", department=" + department +
                ", position=" + position +
                ", createDate=" + createDate +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }

    int id;
    String email;
    String userName;
    Department department;
    Position position;
    Date createDate;
    Group[] groups;


}
