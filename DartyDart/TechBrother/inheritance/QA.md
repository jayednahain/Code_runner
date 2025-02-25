## 1. When you extend a parent with a constructor that has parameters, you must pass something to it.
- Why?
```dart
Labrador(String name) : super(name);
```
- The parent class's constructor is responsible for initializing its own properties. If it requires parameters, it needs those parameters to do its job.
- If you don't provide the required parameters, Dart will produce a compile-time error.
- The super class constructor must be called before the sub class constructor body.