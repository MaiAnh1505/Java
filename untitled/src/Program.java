import java.sql.Date;
public class Program {
    public static void main(String[] args) {
        // Tạo Department
        Department dep1 = new Department();
        dep1.departmentID = 1;
        dep1.departmentName = "Marketing";

        Department dep2 = new Department();
        dep2.departmentID = 2;
        dep2.departmentName = "Sale";

        Department dep3 = new Department();
        dep3.departmentID = 3;
        dep3.departmentName = "BOD";

        System.out.println("Thông tin các phòng ban");
        System.out.println(dep1);
        System.out.println(dep2);
        System.out.println(dep3);

        // Tạo position
        Position pos1 = new Position();
        pos1.id = 1;
        pos1.name = PositionName.DEV;

        Position pos2 = new Position();
        pos2.id = 2;
        pos2.name = PositionName.TEST;

        Position pos3 = new Position();
        pos3.id = 3;
        pos3.name = PositionName.SCRUM_MASTER;

        Position pos4 = new Position();
        pos4.id = 4;
        pos4.name = PositionName.PM;

        System.out.println(" Thông tin các vị trí công việc ");
        System.out.println(pos1);
        System.out.println(pos2);
        System.out.println(pos3);
        System.out.println(pos4);


        // Tạo Account
        Account acc1 = new Account();
        acc1.id = 1;
        acc1.email = "maianh1";
        acc1.userName = "maianh1";
        acc1.department = dep1;
        acc1.position = pos1;
        acc1.createDate = new Date(2020 - 11 - 12);


        Account acc2 = new Account();
        acc2.id = 2;
        acc2.email = "maianh2";
        acc2.userName = "maianh2";
        acc2.department = dep2;
        acc2.position = pos2;
        acc2.createDate = new Date(2010 - 12 - 15);


        Account acc3 = new Account();
        acc3.id = 3;
        acc3.email = "maianh3";
        acc3.userName = "maianh3";
        acc3.department = dep3;
        acc3.position = pos3;
        acc3.createDate = new Date(2015 - 10 - 18);

        System.out.println(" Thông tin các tài khoản ");
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);


        // Tạo Group
        Group group1 = new Group();
        group1.id = 1;
        group1.name = "Developer";

        Group group2 = new Group();
        group2.id = 2;
        group2.name = "Test";

        Group group3 = new Group();
        group3.id = 3;
        group3.name = "Sale";

        System.out.println(" Thông tin các nhóm ");
        System.out.println(group1);
        System.out.println(group2);
        System.out.println(group3);


        // Tạo GroupAccount
        GroupAccount ga1 = new GroupAccount();
        ga1.groupID = 1;
        ga1.joinDate = new Date(2011 - 10 - 12);

        GroupAccount ga2 = new GroupAccount();
        ga2.groupID = 2;
        ga2.joinDate = new Date(2011 - 10 - 12);

        GroupAccount ga3 = new GroupAccount();
        ga3.groupID = 3;
        ga3.joinDate = new Date(2011 - 10 - 12);

        System.out.println(" Thông tin các User ");
        System.out.println(ga1);
        System.out.println(ga2);
        System.out.println(ga3);


        // Tạo TypeQuestion
        TypeQuestion tq1 = new TypeQuestion();
        tq1.id = 1;
        tq1.typeName = "Essay";

        TypeQuestion tq2 = new TypeQuestion();
        tq2.id = 2;
        tq2.typeName = "Multiple-Choice";

        TypeQuestion tq3 = new TypeQuestion();
        tq3.id = 3;
        tq3.typeName = "Dificult";

        System.out.println(" Thông tin các câu hỏi ");
        System.out.println(tq1);
        System.out.println(tq2);
        System.out.println(tq3);


        // Tạo CategoryQuestion
        CategoryQuestion cq1 = new CategoryQuestion();
        cq1.categoryID = 1;
        cq1.categoryName = "Java";

        CategoryQuestion cq2 = new CategoryQuestion();
        cq2.categoryID = 2;
        cq2.categoryName = "Java";

        CategoryQuestion cq3 = new CategoryQuestion();
        cq3.categoryID = 1;
        cq3.categoryName = "Java";

        System.out.println("Thông tin câu hoi");
        System.out.println(cq1);
        System.out.println(cq2);
        System.out.println(cq3);


        // TestingSystem_Assignment_2
        // Question 1:  Question 3: Kiểm tra account thứ 2
        //Nếu không có phòng ban (tức là department == null) thì sẽ in ra text "Nhân viên này chưa có phòng ban"
        if (acc2.department == null) {
            System.out.println("Nhân viên này chưa có phòng ban");
        } else {
            System.out.println("Phònh ban nhân viên này là " + acc2.department.departmentName);
        }


        // Question 2:
        if (acc2.groups == null) {
            System.out.println("Nhân viên này chưa có group");
        } else if (acc2.groups.length == 1 || acc2.groups.length == 2) {
            System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
        } else if (acc2.groups.length == 3) {
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group ");
        } else if (acc2.groups.length == 4) {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group ");
        }


        // Question 3:
        System.out.println(acc2.department == null ? "Nhân viên này chưa có phòng ban" : "Phòng ban nhân viên này là " + acc2.department.departmentName);


        // Question 4:
        System.out.println(acc1.position.name == PositionName.DEV ? "Đây là Developer" : "Người này không phải là Developer" + acc1.position.name);


        // Question 5:

        // Question 6:
        // Question 7:

        // Question 8:
        // Question 9:
        // Question 10:



    }


}






