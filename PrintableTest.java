
package printabletest;


public class PrintableTest {
    public static void main(String[] args) {
        Printable[] printables = {
            new Document("Project Report"),
            new Photo("Vacation.jpg"),
            new Document("Resume"),
            new Photo("Family.png")
        };

        for (Printable item : printables) {
            item.print();  // Polymorphic call
        }
    }
}

