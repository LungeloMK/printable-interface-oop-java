
package printabletest;

public class Photo implements Printable {
    private String filename;

    public Photo(String filename) {
        this.filename = filename;
    }

    @Override
    public void print() {
        System.out.println("Printing photo: " + filename);
    }
}
