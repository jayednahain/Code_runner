class Laptop {
  int? price;
  String? brand;
  Laptop(this.price, this.brand) {
    print("parent class constructor called");
  }

  void displayLaptopClassInfo() {
    print("parent price $price");
    print("parent brand $brand");
  }
}

class MacBook extends Laptop {
  // super call parent class constructor;
  MacBook() : super(1, "5");
}

void main(List<String> args) {
  MacBook macBook = new MacBook();
  macBook.displayLaptopClassInfo();
}
