public class Student{
  private int rollno;
  private String name;
  private String dept;
  private char section;
  void setRollno(int rollno) {
    this.rollno=rollno;
  }
  void setName(String name) {
    this.name=name;
  }
  void setDept(String dept) {
    this.dept=dept;
  }
  void setSection(char section) {
    this.section=section;
  }
  //getters
  int getRollno() {
    return this.rollno;
  }
  String getName() {
    return this.name;
  }
  String getDept() {
    return this.dept;
  }
  char getSection() {
    return this.section;
  }
}
public class Greetings {
  public static void main(String args[]){
    // TODO Auto-generated method stub
    Student st=new Student();
    st.setRollno(015);
    st.setName("Suyog");
    st.setDept("Mech");
    st.setSection('A');
    System.out.println(st.getRollno()+" "+st.getName()+" "+st.getDept()+" "+st.getSection());
  }
}

