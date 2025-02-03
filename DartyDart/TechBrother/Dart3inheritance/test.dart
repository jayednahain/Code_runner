class Person {
  String? name;
  int? age;
  void displayPersonInfo() {
    print(name);
    print(age);
    print(this.age);
  }
}

class Student extends Person {
  int? rollNum;
  String? section;
  void displayStudentInfo() {
    // super.displayPersonInfo();
    print(rollNum);
    print(section);
  }
}

void main(List<String> args) {
  Student student = Student();
  student.name = "jayed khan";
  student.age = 55;
  // student.displayPersonInfo();

  student.rollNum = 6589;
  student.section = "k";
  student.displayStudentInfo();
}
