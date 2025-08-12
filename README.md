# Printable Interface (OOP in Java)

##  Overview
This Java program demonstrates the use of **interfaces** and **polymorphism**.  
The `Printable` interface declares a `print` method, which is implemented by `Document` and `Photo` classes.  
An array of `Printable` objects calls the `print` method polymorphically.

---

##  Features
- Interface `Printable` with abstract `print` method.
- Classes `Document` and `Photo` implement the interface.
- Polymorphic calls to `print` on mixed array of objects.

---

##  Technologies Used
- **Java** (JDK 8 or higher)

---

##  Code

### Printable.java
```java
public interface Printable {
    void print();
}
