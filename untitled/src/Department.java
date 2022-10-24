public class Department {
  int departmentID;

  @Override
  public String toString() {
    return "Department{" +
            "departmentID=" + departmentID +
            ", departmentName='" + departmentName + '\'' +
            '}';
  }

  String departmentName;
}
