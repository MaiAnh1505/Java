import java.sql.Date;
public class GroupAccount {
    @Override
    public String toString() {
        return "GroupAccount{" +
                "groupID=" + groupID +
                ", account=" + account +
                ", joinDate=" + joinDate +
                '}';
    }

    int  groupID;
    Account account;
    Date joinDate;




}
