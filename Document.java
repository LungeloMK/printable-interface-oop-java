
package printabletest;

public class Document implements Printable {
    private String title;

    public Document(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Printing document: " + title);
    }
}

