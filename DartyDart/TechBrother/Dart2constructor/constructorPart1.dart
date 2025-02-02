void main(List<String> args) {
  //initialize class using direct object
  //using object
  // Student student = Student();
  // student.name = "jayed nahian";
  // student.age = 4
  // 5;
  // print(student.name);
  // print(student.age);

  // StudentWithConstructor obj1 = StudentWithConstructor("nahian", 55);
  // obj1.displayInfo();
  // StudentWithConstructor obj2 = StudentWithConstructor("jayed", 55);
  // obj2.displayInfo();

  List<StudentWithConstructor> _studentData = [
    StudentWithConstructor("amit", 55),
    StudentWithConstructor("murshed", 55),
    StudentWithConstructor("jamshed", 55),
    StudentWithConstructor("jayed", 55),
    StudentWithConstructor("nahian", 55)
  ];

  _studentData.forEach((element) {
    print(element.name);
  });
}

class Student {
  String? name;
  int? age;

  void displayInfo() {
    print("class student name: $name");
    print("class student age: $age");
  }
}

class StudentWithConstructor {
  String? name;
  int? age;
  StudentWithConstructor(String name, int age) {
    print("constructor called --------");
    print("constructor name $name");
    this.name = name;
    this.age = age;
  }

  void displayInfo() {
    print("class displayInfo student name: $name");
    print("class  displayInfo student age: $age");
  }
}
