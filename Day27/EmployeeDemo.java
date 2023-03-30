class Employee {
  private int id;
  private String name;
  private String office;
  void setId(int id) {
    this.id = id;
  }
  void setName(String name) {
    this.name = name;
  }
  void setOffice(String office) {
    this.office = office;
  }
  int getId() {
    return this.id;
  }
  String getName() {
    return this.name;
  }
  String getOffice() {
    return this.office;
  }
}
class EmployeeDemo {
  public static void main(String args[]) {
    Employee obj = new Employee();
    obj.setId(24);
    obj.setName("Suyog");
    obj.setOffice("bitLabs");
    System.out.println("Employee Details:");
    System.out.println("Employee Name: " + obj.getName());
    System.out.println("Employee Id: " + obj.getId());
    System.out.println("Employee Office: " + obj.getOffice());
  }
}