import java.sql.Date;
import java.util.Arrays;

public class Group {
    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creator=" + creator +
                ", createDate=" + createDate +
                ", accounts=" + Arrays.toString(accounts) +
                '}';
    }

    int  id;
    String name;
    Account creator;
    Date createDate;
    Account[] accounts;



}
